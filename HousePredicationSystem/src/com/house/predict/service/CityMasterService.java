package com.house.predict.service;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.house.predict.model.AreaMasterModel;
import com.house.predict.model.CityMasterModel;
import com.house.predict.repositroy.CityMasterRepository;

public class CityMasterService {
	CityMasterRepository cityRepo= new CityMasterRepository();
	public boolean isAddCity(CityMasterModel model) {
		boolean b=cityRepo.isAddNewCity(model);
		return b;
	}
	public List<CityMasterModel> getAllCities(){
		return cityRepo.getAllCities();
	}
	public  boolean isBulkAddCities() {
		return cityRepo.isBulkAddCities();
	}
	public int getCityId(String cityName) {
		return cityRepo.getcity(cityName);
	}
	public int getAreaIdAutomatic() {
		return cityRepo.getAreaIdAutomatic();
	}
	public boolean isAddArea(AreaMasterModel model) {
		return cityRepo.isAddArea(model);
	}
/*	public boolean isAreaPresent(AreaMasterModel model) {
	 	return cityRepo.isAreaPresent(model);
	 }	 */
	public LinkedHashMap<String,Integer> getCityWiseAreaCount(){
		return cityRepo.getCityWiseAreaCount();
	}
	public LinkedHashMap<String,ArrayList<String>> getCityWiseAreaNames(){
		return this.cityRepo.getCityWiseAreaNames();
	}
	public int getAreaIdByName(AreaMasterModel model) {
		return cityRepo.getAreaIdByName(model);
	}
}
