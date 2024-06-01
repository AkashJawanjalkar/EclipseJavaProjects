package org.hotel.recc.service;

import org.hotel.recc.model.AreaMasterModel;
import org.hotel.recc.repository.AreaMasterRepository;

public class AreaMasterService {
	AreaMasterRepository areaMastRepo = new AreaMasterRepository();

	public int getArea(String areaName) {

		return areaMastRepo.getArea(areaName);
	}

	public boolean isAddArea(AreaMasterModel aModel) {
		return areaMastRepo.isAddArea(aModel);
	}
	
	public boolean isUpdateArea(AreaMasterModel aModel)
	{
		return areaMastRepo.isUpdateArea(aModel);
	}
}