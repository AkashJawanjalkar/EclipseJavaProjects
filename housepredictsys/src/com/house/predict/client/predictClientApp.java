package com.house.predict.client;
import java.util.*;
import com.house.predict.service.*;
import com.house.predict.model.*;
public class predictClientApp {
	public static void main(String args[]) {
		CityMasterService cms= new CityMasterService();
		AreaSquareFeetService areaSq=new AreaSquareFeetService();
		AminityService amService = new AminityService();
		PropertyService propServ=new PropertyService();
		do {
			Scanner sc= new Scanner(System.in);
			int choice;
			System.out.println("Enter You choice:");
			System.out.println("1.Add new City:");
			System.out.println("2.Show all cities:");
			System.out.println("3.Add Bulk Cities:");
			System.out.println("4.Add new Areas:");
			System.out.println("5.citywise area counting");
			System.out.println("6.citywise area names:");
			System.out.println("7.Add Square feet in area:");
			System.out.println("8.Add Aminities:");
			System.out.println("9.Add Property ");
			System.out.println("10.");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter city name:");
				String city=sc.nextLine();
				CityMasterModel model= new CityMasterModel();
				model.setCityName(city);
				boolean b= cms.isAddCity(model);
				if(b)
					System.out.println("New City Added in database");
				else
					System.out.println("City not added");
				break;
			case 2:
				List<CityMasterModel> list= cms.getAllCities();
				if(list!=null) {
					System.out.println("City ID\t City Name");
					System.out.println("----------------------------------------------------");
					list.forEach((m)->System.out.println(m.getCityId()+"\t"+m.getCityName()));
					System.out.println("----------------------------------------------------");
				}
				else
					System.out.println("no Cities Present");
				break;
			case 3:
				b=cms.isBulkAddCities();
				if(b) {
					System.out.println("City added Successfully....");
				}
				else
					System.out.println("Some problem in file...");
				break;
			case 4:
				sc.nextLine();
				System.out.println("Enter city name:");
				String cityName=sc.nextLine();
				int cityId=cms.getCityId(cityName);
				if(cityId!=-1) {
					System.out.println("Enter area name:");
					String areaName=sc.nextLine();
					int areaId=cms.getAreaIdAutomatic();
					AreaMasterModel amodel=new AreaMasterModel();
					amodel.setCityId(cityId);
					amodel.setAreaId(areaId);
					amodel.setAreaName(areaName);
//					b=cms.isAreaPresent(amodel);
					b=cms.isAddArea(amodel);
					if(b) {
						System.out.println("Area added successfully....");
					}
					else
						System.out.println("unsucessfull....");
				}
				else {
					System.out.println("City is not present in data base table.");
					System.out.println("Do you want to add this city in database:");
					String msg=sc.nextLine();
					if(msg.equals("yes")) {
						model= new CityMasterModel();
						model.setCityName(cityName);
						b= cms.isAddCity(model);
						if(b)
							System.out.println("New City Added in database");
						else
							System.out.println("City not added");
					}
					else
						System.out.println("Thank you.....\n visit again....");
				}
				break;
			case 5:
				LinkedHashMap<String,Integer> map=cms.getCityWiseAreaCount();
				Set<Map.Entry<String, Integer>> s= map.entrySet();
				for(Map.Entry<String, Integer> m:s) {
					System.out.println(m.getKey()+"\t"+m.getValue());
					
				}
				break;
			case 6:
				LinkedHashMap<String,ArrayList<String>> areaNames=cms.getCityWiseAreaNames();
				Set<Map.Entry<String, ArrayList<String>>> set=areaNames.entrySet();
				for(Map.Entry<String, ArrayList<String>> m:set) {
					ArrayList<String> values=m.getValue();
					if(values.size()>0) {
						System.out.println("City Names:"+m.getKey());
						System.out.println("------------------------------------");
						for(String areaName:values) {
							System.out.println(areaName);
						}
						System.out.println("------------------------------------");
					}
					
				}
				break;
			case 7:
				System.out.println("Enter area value in Square feet:");
				int sqFeet=sc.nextInt();
				AreaSquareFeetModel areaFeetModel=new AreaSquareFeetModel();
				areaFeetModel.setSquareFeet(sqFeet);
				b=areaSq.isAddSquareFeet(areaFeetModel);
				if(b) {
					System.out.println("Square feet Added in datatbase table:");
				}
				else
					System.out.println("Some problem is their.");
			break;
			case 8:
				sc.nextLine();
				System.out.println("Enter the aminities:");
				String name=sc.nextLine();
				AmenityModel ammodel=new AmenityModel();
				ammodel.setName(name);
				b=amService.isAddAminity(ammodel);
				if(b) {
					System.out.println("New Aminity Added in database.");
				}
				else
					System.out.println("Some problem is their.");
				break;
			case 9:
				sc.nextLine();
				System.out.println("Enter City Name:");
				cityName=sc.nextLine();
				System.out.println("Enter Area Name:");
				String areaName=sc.nextLine();
				System.out.println("Enter Address of property:");
				String propertyAdd=sc.nextLine();
				System.out.println("Enter Land Area");
				int landArea=sc.nextInt();
				int sqid=areaSq.getSquareFeetId(landArea);
				System.out.println("Enter the number of beds and bathrooms:");
				int nbed=sc.nextInt();
				int nbath=sc.nextInt();
				cityId=cms.getCityId(cityName);
				
				AreaMasterModel amodel=new AreaMasterModel();
				amodel.setAreaName(areaName);
				amodel.setCityName(cityName);
				int areaId=cms.getAreaIdByName(amodel);
				amodel.setCityId(cityId);
				amodel.setAreaId(areaId);
				
				if(sqid==-1) {
					System.out.println("Their is some exception");
				}
				if(sqid==0) {
					sc.nextLine();
					System.out.println("Area not present do you want to add area:");
					String msg=sc.nextLine();
					if(msg.equals("yes")) {
						areaFeetModel=new AreaSquareFeetModel();
						areaFeetModel.setSquareFeet(landArea);
						b=areaSq.isAddSquareFeet(areaFeetModel);
						if(b) {
							System.out.println("Square feet Added in datatbase table:");
						}
						else
							System.out.println("Some problem is their.");
					}
				}
				else {
					List<AmenityModel> aminityList = new ArrayList<AmenityModel>();
					String str="";
					sc.nextLine();
					do {
						System.out.println("Enter Aminity names");
						String amname=sc.nextLine();
						AmenityModel amModel= new AmenityModel();
//						int amId=
						amModel.setName(amname);
						aminityList.add(amModel);
						System.out.println("Do you want to add more amenities:");
						str=sc.nextLine();
						} while(str.equals("yes"));
					PropertyModel propModel=new PropertyModel();
					propModel.setAreaModel(amodel);
					propModel.setName(propertyAdd);
					propModel.setNbath(nbath);
					propModel.setNbed(nbed);
					areaFeetModel= new AreaSquareFeetModel();
					areaFeetModel.setSquareFeet(landArea);
					areaFeetModel.setId(sqid);
					propModel.setSqModel(areaFeetModel);
					propModel.setList(aminityList);
					System.out.println("Enter the price");
					int price=sc.nextInt();
					sc.nextLine();
					DealModel dmodel=new DealModel();
					dmodel.setPrice(price);
					propModel.setDmodel(dmodel);
					b=propServ.isAddNewProperty(propModel);
					if(b){
						System.out.println("New Property added");
					}
					else
						System.out.println("No property Addes");
				}
				break;
			default:
				System.out.println("Wrong choice.");
				break;
				
			}
			
		}while(true);
	}
}
