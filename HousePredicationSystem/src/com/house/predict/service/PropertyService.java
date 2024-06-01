package com.house.predict.service;
import com.house.predict.model.PropertyModel;
import com.house.predict.repositroy.PropertyRepository;
public class PropertyService {
	PropertyRepository propRepo=new PropertyRepository();
	public boolean isAddNewProperty(PropertyModel model) {
		return propRepo.isAddNewProperty(model);
	}
}
