package org.hotel.recc.service;

import java.util.List;

import org.hotel.recc.model.AreaMasterModel;
import org.hotel.recc.model.CityMasterModel;
import org.hotel.recc.repository.CityMasterRepository;

public class CityMasterService {

	CityMasterRepository cityMasterRepo = new CityMasterRepository();

	public boolean isAddNewCity(CityMasterModel cModel) {
		return cityMasterRepo.isAddNewCity(cModel);
	}

	public int getCity(String CityName) {
		return cityMasterRepo.getCity(CityName);
	}

	public boolean isBulkAddCities() {
		return cityMasterRepo.isAddBulkCities();
	}

	public boolean isUpdateCity(CityMasterModel cModel) {
		return cityMasterRepo.isUpdateCity(cModel);
	}

	

}