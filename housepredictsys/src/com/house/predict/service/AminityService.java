package com.house.predict.service;

import com.house.predict.model.AmenityModel;
import com.house.predict.repositroy.*;

public class AminityService{
	AminityRepository aminityRepo=new AminityRepository();
	public boolean isAddAminity(AmenityModel model) {
		return aminityRepo.isAddAminity(model);
	}
	public int getAminityId(String AminityName) {
		return 0;
	}
}
