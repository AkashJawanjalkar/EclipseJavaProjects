package org.hotel.recc.service;

import java.util.List;

import org.hotel.recc.model.AreaMasterModel;
import org.hotel.recc.model.CityMasterModel;
import org.hotel.recc.model.HotelMasterModel;
import org.hotel.recc.repository.HotelMasterRepository;

public class hotelMasterService {
	HotelMasterRepository hotelMasterRepo = new HotelMasterRepository();

//	public boolean isAddNewHotel(HotelMasterModel hModel, int cityId, int areaId) {
//		return hotelMasterRepo.isAddNewHotel(hModel, cityId, areaId);
//	}

	public List<HotelMasterModel> getAllHotels() {
		return hotelMasterRepo.getAllHotels();
	}
	
	public boolean isUpdateHotel(HotelMasterModel hModel)
	{
		return hotelMasterRepo.isUpdateHotel(hModel);
	}

	public boolean isDeleteHotel(HotelMasterModel hModel) {
		// TODO Auto-generated method stub
		return hotelMasterRepo.isDeleteHotel(hModel);
	}

	public boolean isAddNewHotel(HotelMasterModel hModel, int cityId, int areaId) {
		// TODO Auto-generated method stub
		return hotelMasterRepo.isAddNewHotel(hModel, cityId, areaId);
	}
}