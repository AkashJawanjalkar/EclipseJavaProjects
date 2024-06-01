package com.house.predict.repositroy;

import java.util.*;
import java.io.*;
import java.sql.*;

import com.house.predict.config.*;
import com.house.predict.model.*;

public class CityMasterRepository extends DBHelper{
	private List<CityMasterModel> list= new ArrayList<CityMasterModel>();
	private List<Object[]> cityWiseAreaCountList;
	private LinkedHashMap<String,Integer> getCityWiseAreaCountList;
	private LinkedHashMap<String,ArrayList<String>> cityWiseAreaMap;
	private int areaid=0;
	public boolean isAddNewCity(CityMasterModel model) {
		try {
			stmt=conn.prepareStatement("insert into citymaster values('0',?)");
			stmt.setString(1,model.getCityName());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception e) {
			System.out.println("Error is:"+e);
			return false;
		}
	}
	public List<CityMasterModel> getAllCities(){
		try {
			stmt=conn.prepareStatement("Select * from citymaster");
			rs=stmt.executeQuery();
			while(rs.next()) {
				CityMasterModel model= new CityMasterModel();
				model.setCityId(rs.getInt(1));
				model.setCityName(rs.getString(2));
				list.add(model);
			}
			return list.size()>0?list:null;
		}catch(Exception e) {
			System.out.println("Error is:"+e);
			return null;
		}
	}
	public  boolean isBulkAddCities() {
		try {
			FileReader fr= new FileReader(PathHelper.path+"cities.csv");
			BufferedReader br= new BufferedReader(fr);
			String line;
			int value=0;
			while((line=br.readLine())!=null){
				String data[]= line.split(",");
				stmt=conn.prepareStatement("insert into citymaster values('0',?)");
				stmt.setString(1,data[1]);
				value=stmt.executeUpdate();
			}
			return value>0?true:false;
			
		}catch(Exception e) {
			System.out.println("Error is"+e);
			return false;
		}
	}
	
	public int getcity(String cityName) {
		try {
			stmt=conn.prepareStatement("Select cityid from citymaster where cityname=?");
			stmt.setString(1,cityName);
			rs=stmt.executeQuery();
			if(rs.next()) 
				return rs.getInt(1);
			else
				return -1;
			}catch(Exception e) {
			System.err.println("Error is: "+e);
			return -1;
			}
	}
	public int getAreaIdAutomatic() {
		try {
			stmt=conn.prepareStatement("select max(areaid) from areamaster");
			rs=stmt.executeQuery();
			if(rs.next()) {
				this.areaid=rs.getInt(1);
			}
			++areaid;
			return areaid;
		}catch(Exception e) {
			System.out.println("Error is: "+e);
			return 0;
		}
	}
	public boolean isAddArea(AreaMasterModel model) {
		try {
			CallableStatement cstmt=conn.prepareCall("call savearea(?,?,?)");
			cstmt.setInt(1,model.getAreaId());
			cstmt.setString(2,model.getAreaName());
			cstmt.setInt(3, model.getCityId());
			boolean b=cstmt.execute(); // return false for last time execution
			return !b;
		}
		catch(Exception e) {
			System.out.println("Error is:"+e);
			return false;
		}
	}
	/*
	 * public boolean isAreaPresent(AreaMasterModel model) { try {
	 * stmt=conn.prepareStatement("select areaname from areamaster");
	 * rs=stmt.executeQuery(); if(rs.next()) {
	 * model.getAreaName().equals(rs.getString(2)); return true; } return false; }
	 * catch (Exception e) { System.out.println("Error is:"+e); return false; } }
	 */
	
	
	/*
	public List<Object[]> getCityWiseCount(){
		try {
			this.cityWiseAreaCountList=new ArrayList<Object[]>();
			stmt=conn.prepareStatement("select cm.cityname,count(am.areaname) from citymaster cm inner join cityareajoin ca on cm.cityid=ca.cityid inner join areamaster am on ca.areaid=am.areaid group by cm.cityname;");
			rs=stmt.executeQuery();
			while(rs.next()) {
				Object obj[]=new Object[]{rs.getString(1),rs.getInt(2)};
				this.cityWiseAreaCountList.add(obj);
				}
			return this.cityWiseAreaCountList;
		} catch (Exception e) {
			System.out.println("Error is:"+e);
			return null;
		}
	}
	*/
	public LinkedHashMap<String,Integer> getCityWiseAreaCount(){
		try {
			this.getCityWiseAreaCountList=new LinkedHashMap();
			stmt=conn.prepareStatement("select cm.cityname,count(am.areaname) from citymaster cm inner join cityareajoin ca on cm.cityid=ca.cityid inner join areamaster am on ca.areaid=am.areaid group by cm.cityname;");
			rs=stmt.executeQuery();
			while(rs.next()) {
				getCityWiseAreaCountList.put(rs.getString(1),rs.getInt(2));
				}
			return getCityWiseAreaCountList;
		} catch (Exception e) {
			System.out.println("Error is:"+e);
			return null;
		}
	}
	public LinkedHashMap<String,ArrayList<String>> getCityWiseAreaNames(){
		try {
			this.cityWiseAreaMap=new LinkedHashMap<String,ArrayList<String>> ();
			stmt=conn.prepareStatement("select cityname from citymaster");
			rs=stmt.executeQuery();
			
			while(rs.next()) {
				String cityName=rs.getString(1);
				PreparedStatement stmt1=conn.prepareStatement("select am.areaname from areamaster am inner join cityareajoin ca on am.areaid=ca.areaid inner join citymaster cm on ca.cityid=cm.cityid where cityname=?");
				stmt1.setString(1, cityName);
				ResultSet rs1=stmt1.executeQuery();
				ArrayList<String> areaNames=new ArrayList<String>();
				while(rs1.next())  {
					areaNames.add(rs1.getString(1));
				}
				this.cityWiseAreaMap.put(cityName, areaNames);
			}
			return cityWiseAreaMap;
		} catch (Exception e) {
			System.out.println("Error is:"+e);
			return null;
		}
		
	}
	public int getAreaIdByName(AreaMasterModel model) {
		try {
			stmt=conn.prepareStatement("select am.areaid from areamaster am inner join cityareajoin ca on am.areaid= ca.areaid inner join citymaster cm on ca.cityid=cm.cityid where am.areaname=? and cm.cityname=? ");
			stmt.setString(1, model.getAreaName());
			stmt.setString(2, model.getCityName());
			rs=stmt.executeQuery();
			if(rs.next()) 
				return rs.getInt(1);
			else
				return 0;
		} catch (Exception e) {
			System.out.println("Error is:"+e);
			return -1;
		}
	}
	
}
