package org.hotel.recc.repository;

import java.io.BufferedReader;
import java.io.FileReader;

import org.hotel.recc.config.DBHelper;
import org.hotel.recc.config.PathHelper;
import org.hotel.recc.model.CityMasterModel;

public class CityMasterRepository extends DBHelper {

	public boolean isAddNewCity(CityMasterModel cModel) {
		try {
			pstmt = conn.prepareStatement("Insert into citymaster values('0',?)");
			pstmt.setString(1, cModel.getCityName());
			int value = pstmt.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
	}

	public int getCity(String name) {
		try {
			pstmt = conn.prepareStatement("select ctid from citymaster where ctname=?");
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			} else {
				return -1;
			}
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return -1;
		}
	}

	public boolean isAddBulkCities() {
		try {
			FileReader fr = new FileReader(PathHelper.path + "CityH.csv");
			BufferedReader br = new BufferedReader(fr);
			int value = 0;
			String line = null;
			while ((line = br.readLine()) != null) {
				String data[] = line.split(",");
				pstmt = conn.prepareStatement("insert into citymaster values('0',?)");
				pstmt.setString(1, data[1]);
				value = pstmt.executeUpdate();
			}
			return value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
	}
	
	public boolean isUpdateCity(CityMasterModel cModel)
	{
		try
		{
			pstmt = conn.prepareStatement("update citymaster set ctname= ? where ctid=?");
			pstmt.setString(1, cModel.getCityName());
			pstmt.setInt(2, cModel.getCityId());
			int value= pstmt.executeUpdate();
			
			return value>0?true:false;
			
		} catch (Exception ex) 
		{
			System.out.println("Error is " + ex);
			return false;
		}
		
	}

	

}