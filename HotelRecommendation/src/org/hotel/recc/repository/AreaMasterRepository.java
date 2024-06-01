package org.hotel.recc.repository;

import org.hotel.recc.config.DBHelper;
import org.hotel.recc.model.AreaMasterModel;

public class AreaMasterRepository extends DBHelper {

	public int getArea(String name) {
		try {
			pstmt = conn.prepareStatement("select arid from areamaster where arname=?");
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

	public boolean isAddArea(AreaMasterModel aModel) {
		try {
			pstmt = conn.prepareStatement("insert into areamaster values('0',?)");
			pstmt.setString(1, aModel.getAreaName());
			int value = pstmt.executeUpdate();
			return value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
	}
	
	public boolean isUpdateArea(AreaMasterModel aModel)
	{
		try
		{
			pstmt = conn.prepareStatement("update areamaster set arname = ? where arid = ?");
			pstmt.setString(1, aModel.getAreaName());
			pstmt.setInt(2, aModel.getAreaId());
			int value = pstmt.executeUpdate();
			return value>0 ? true : false;
		}
		catch(Exception ex)
		{
			System.out.println("Error is "+ex);
			return false;
		}
	}
}
