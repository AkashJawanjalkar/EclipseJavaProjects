package org.hotel.recc.service;

import java.util.List;

import org.hotel.recc.model.RegMasterModel;
import org.hotel.recc.repository.RegMasterRepository;

public class RegMasterService {

	
RegMasterRepository registerMasterRepo = new RegMasterRepository();
	
	public boolean isRegCustomer(RegMasterModel rModel) 
	{
		return registerMasterRepo.isRegCustomer(rModel);
	}
	
	public boolean isLoginUser(RegMasterModel rModel)
	{
		return registerMasterRepo.isLoginUser(rModel);
	}
	
	public List<RegMasterModel> getAllRegCust()
	{
		return registerMasterRepo.getAllRegCust();
	}
}
