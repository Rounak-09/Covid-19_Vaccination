package com.masai.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Admin;
import com.masai.model.AdminSession;
import com.masai.model.User;
import com.masai.model.UserSession;
import com.masai.repository.AdminDao;
import com.masai.repository.AdminSessionDao;
import com.masai.exception.AdminException;
import com.masai.exception.UserException;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminDao aDao;
	
	@Autowired
	AdminSessionDao aSDao;

	@Override
	public Admin saveAdmin(Admin admin) throws AdminException {
		
		return aDao.save(admin);
	}


	@Override
	public AdminSession saveAdminLogin(Admin admin) throws AdminException {
		Long phone = admin.getPhone();
		String password = admin.getPassword();
		Admin existingAdmin = aDao.findByPhone(phone);
		if(existingAdmin==null) {
			throw new AdminException("Invalid admin");
		}
		else {
			String existingPassword = existingAdmin.getPassword();
			if(password.equals(existingPassword)) {
				String key = getRandomString(6);
				LocalDateTime localDateTime = LocalDateTime.now();
				AdminSession adminSession = new AdminSession(existingAdmin.getAdminId(),key,localDateTime);
				aSDao.save(adminSession);
				return adminSession;
			}
			else {
				throw new AdminException("Wrong password");
			}
		}
	}

	private String getRandomString(int n) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789"+"abcdefghijklmnopqrstuvwxyz"+"0123456789";
		String randomString = "";
		
		for(int i=0; i<n; i++) {
			int index = (int) ((Math.random()*str.length()));
			randomString = randomString + str.charAt(index);
		}
		return randomString;
	}
}
