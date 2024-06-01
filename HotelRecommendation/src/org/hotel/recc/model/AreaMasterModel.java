package org.hotel.recc.model;

public class AreaMasterModel extends CityMasterModel{
	
	private int areaId;
	private String AreaName;
	
	public AreaMasterModel()
	{
		
	}
	public AreaMasterModel(int areaId, String AreaName)
	{
		this.areaId=areaId;
		this.AreaName= AreaName;
	}
	public int getAreaId() {
		return areaId;
	}
	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}
	public String getAreaName() {
		return AreaName;
	}
	public void setAreaName(String areaName) {
		AreaName = areaName;
	}

}
