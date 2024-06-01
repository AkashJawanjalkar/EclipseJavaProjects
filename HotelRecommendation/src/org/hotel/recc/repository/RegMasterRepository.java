package org.hotel.recc.repository;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import org.hotel.recc.model.*;

import org.hotel.recc.config.DBHelper;
import org.hotel.recc.model.RegMasterModel;

public class RegMasterRepository extends DBHelper{

	
	private List<RegMasterModel> list = new ArrayList<RegMasterModel>();

	public boolean isRegCustomer(RegMasterModel rModel) {
		try {
			pstmt = conn.prepareCall("insert into registration values('0',?,?,?,?,?)");
			pstmt.setString(1, rModel.getName());
			pstmt.setString(2, rModel.getEmail());
			pstmt.setString(3, rModel.getContact());
			pstmt.setString(4, rModel.getUserName());
			pstmt.setString(5, rModel.getPassword());
			int value = pstmt.executeUpdate();
			return  value > 0 ? true : false;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
	}

	public boolean isLoginUser(RegMasterModel rModel) {
		try {
			pstmt = conn.prepareStatement("select *from registration where username = ? and password = ?");
			pstmt.setString(1, rModel.getUserName());
			pstmt.setString(2, rModel.getPassword());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return false;
		}
	}

	public List<RegMasterModel> getAllRegCust() {
		try {
			pstmt = conn.prepareStatement("select rid, rname, remail, contact from registration");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				RegMasterModel regMastModel = new RegMasterModel();
				regMastModel.setRid(rs.getInt(1));
				regMastModel.setName(rs.getString(2));
				regMastModel.setEmail(rs.getString(3));
				regMastModel.setContact(rs.getString(4));
				list.add(regMastModel);
			}
			return list.size() > 0 ? list : null;
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
			return null;
		}
	}
}
