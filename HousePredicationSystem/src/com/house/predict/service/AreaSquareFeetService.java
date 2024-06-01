package com.house.predict.service;

import com.house.predict.model.AreaSquareFeetModel;
import com.house.predict.repositroy.AreaSquareFeetRepository;

public class AreaSquareFeetService {
	AreaSquareFeetRepository areaSq=new AreaSquareFeetRepository();
	public boolean isAddSquareFeet(AreaSquareFeetModel model) {
		return areaSq.isAddSquareFeet(model);
	}
	public int getSquareFeetId(int areaSqFeet) {
		return areaSq.getSquareFeetId(areaSqFeet);
	}
}
