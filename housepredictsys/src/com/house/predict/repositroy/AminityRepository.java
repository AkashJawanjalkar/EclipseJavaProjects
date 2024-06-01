package com.house.predict.repositroy;

import com.house.predict.model.AmenityModel;
import com.house.predict.config.DBHelper;

public class AminityRepository extends DBHelper{
	public boolean isAddAminity(AmenityModel model) {
		try {
			stmt=conn.prepareStatement("insert into aminitymaster values('0',?)");
			stmt.setString(1,model.getName());
			return stmt.executeUpdate()>0?true:false;
		} catch (Exception e) {
			System.out.println("Error is:"+e);
			return false;
		}
	}
}
