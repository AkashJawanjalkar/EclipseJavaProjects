package org.hotel.recc.service;
import org.hotel.recc.model.AdminLoginModel;
import org.hotel.recc.repository.AdminRepository;

	public class AdminLoginService {
		AdminRepository adminRepository= new AdminRepository();
		
		public boolean AdminLoginUsername(AdminLoginModel amModel) {
			// TODO Auto-generated method stub
			return adminRepository.adminLogin(amModel);
		}
		
		public boolean AdminLoginPassword(AdminLoginModel amModel )
		{
			return adminRepository.adminLogin(amModel);
		}

		
	}


