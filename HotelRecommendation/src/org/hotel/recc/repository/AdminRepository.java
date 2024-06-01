package org.hotel.recc.repository;

import org.hotel.recc.config.DBHelper;
import org.hotel.recc.model.AdminLoginModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AdminRepository extends DBHelper {
    
    
  
    public boolean adminLogin(AdminLoginModel amModel) {
        try {
            pstmt = conn.prepareStatement("SELECT * FROM admin_users WHERE username = ? AND password = ?");
            pstmt.setString(1, amModel.getUsername());
            pstmt.setString(2, amModel.getPassword());
            rs = pstmt.executeQuery();
            return rs.next(); // Returns true if a record is found
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
              //  if (conn != null) conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
