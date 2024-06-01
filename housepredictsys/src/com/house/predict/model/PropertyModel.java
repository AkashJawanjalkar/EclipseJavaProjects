package com.house.predict.model;
import java.util.*;
public class PropertyModel {
	private int id;
	private String name;
	private int nbed;
	private int nbath;
	private AreaMasterModel areaModel;
	private List<AmenityModel> list;
	private AreaSquareFeetModel sqModel;
	private DealModel dmodel;
	public DealModel getDmodel() {
		return dmodel;
	}
	public void setDmodel(DealModel dmodel) {
		this.dmodel = dmodel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<AmenityModel> getList() {
		return list;
	}
	public void setList(List<AmenityModel> list) {
		this.list = list;
	}
	public int getNbed() {
		return nbed;
	}
	public void setNbed(int nbed) {
		this.nbed = nbed;
	}
	public int getNbath() {
		return nbath;
	}
	public void setNbath(int nbath) {
		this.nbath = nbath;
	}
	public AreaMasterModel getAreaModel() {
		return areaModel;
	}
	public void setAreaModel(AreaMasterModel areaModel) {
		this.areaModel = areaModel;
	}
	public AreaSquareFeetModel getSqModel() {
		return sqModel;
	}
	public void setSqModel(AreaSquareFeetModel sqModel) {
		this.sqModel = sqModel;
	}
}
