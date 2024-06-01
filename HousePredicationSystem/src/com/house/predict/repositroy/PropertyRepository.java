package com.house.predict.repositroy;

import java.util.List;

import com.house.predict.config.DBHelper;
import com.house.predict.model.AmenityModel;
import com.house.predict.model.DealModel;
import com.house.predict.model.PropertyModel;

public class PropertyRepository extends DBHelper{
	public boolean isAddNewProperty(PropertyModel model) {
		int pId=model.getId();
		String propertyName=model.getName();
		int sqId=model.getSqModel().getId();
		int areaId=model.getAreaModel().getAreaId();
		int cityId=model.getAreaModel().getCityId();
		int nbed=model.getNbed();
		int nbath=model.getNbath();
		System.out.println("PropertyMaster");
		System.out.println("Id\tAddress\tSquare Feet\tArea id\tCity id\tno of beds\tno of baths");
		System.out.println(pId+1+"\t"+propertyName+"\t"+sqId+"\t"+areaId+"\t"+cityId+"\t"+nbed+"\t"+nbath);
		List<AmenityModel> list=model.getList();
		System.out.println("Aminities");
		int count=0;
		for(AmenityModel m:list) {
			count+=m.getId()+1;
			System.out.println(count+"\t"+m.getName());
		}
		System.out.println("property Aminity Relastionship");
		count=0;
		pId++;
		for(AmenityModel m:list) {
			count+=m.getId()+1;
			System.out.println(pId+"\t"+m.getId());
		}
		System.out.println("Property and price Relastionship");
		DealModel dmodel=model.getDmodel();
		System.out.println((dmodel.getTransId()+1)+"\t"+dmodel.getPrice()+"\t"+dmodel.getDate());
		return true;
	}
}
