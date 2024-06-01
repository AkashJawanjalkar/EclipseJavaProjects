package org.hotel.recc.repository;

import java.util.ArrayList;
import java.util.List;

import org.hotel.recc.config.DBHelper;
import org.hotel.recc.model.AreaMasterModel;
import org.hotel.recc.model.CityMasterModel;
import org.hotel.recc.model.HotelMasterModel;

public class HotelMasterRepository extends DBHelper {
	private List<HotelMasterModel> list = new ArrayList<HotelMasterModel>();

	public boolean isAddNewHotel(HotelMasterModel hModel, int cityId, int areaId) {
		boolean c = false;
		try {
			int NHid = 0;
			pstmt = conn.prepareStatement("insert into hotelmaster values('0',?,?,?)");
			pstmt.setString(1, hModel.getHname());
			pstmt.setString(2, hModel.getHtype());
			pstmt.setInt(3, hModel.getPrice());
			int value = pstmt.executeUpdate();
			System.out.println(hModel.getHid());
			System.out.println(cityId);
			System.out.println(areaId);

			pstmt = conn.prepareStatement("select hid from hotelmaster where Hname=?");
			pstmt.setString(1, hModel.getHname());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				NHid  = rs.getInt(1);
			}

			if (value > 0) {
				pstmt = conn.prepareStatement("insert into cahoteljoin value(?,?,?)");
				pstmt.setInt(1, cityId);
				pstmt.setInt(2, areaId);
				pstmt.setInt(3, NHid);
				value = pstmt.executeUpdate();
				if (value > 0) {
					System.out.println("cajoin data added");
					c = true;
				} else {
					System.out.println("cajoin data not added");
				}

			} else {
				System.out.println("hotel not added");
			}

		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
		return c ? true : false;

	}

	public List<HotelMasterModel> getAllHotels() {
		try {
			pstmt = conn.prepareStatement("select *from Hotelmaster");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				HotelMasterModel hmodel = new HotelMasterModel();
				hmodel.setHid(rs.getInt(1));
				hmodel.setHname(null);
				hmodel.setHtype(rs.getString(3));
				hmodel.setPrice(rs.getInt(4));
				list.add(hmodel);
			}
			return list.size() > 0 ? list : null;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return null;
		}
	}
	
	public boolean isUpdateHotel(HotelMasterModel hModel)
	{
		try
		{
			pstmt = conn.prepareStatement("update hotelmaster set Hname = ? where hid = ?");
			pstmt.setString(1, hModel.getHname());
			pstmt.setInt(2, hModel.getHid());
			int value = pstmt.executeUpdate();
			return value>0 ? true : false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}
	
	public boolean isDeleteHotel(HotelMasterModel hModel) {
		try
		{
			pstmt = conn.prepareStatement("delete from hotelmaster where hname = ?");
			pstmt.setString(1, hModel.getHname());
			int value = pstmt.executeUpdate();
			return value>0 ? true:false;
			
		}
		catch(Exception ex)
		{
			System.out.println("Erro is "+ex);
			return false;
		}
	}

	
	

}