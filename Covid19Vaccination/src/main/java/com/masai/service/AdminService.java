package com.masai.service;

import org.springframework.stereotype.Service;

import com.masai.exception.AdminException;
import com.masai.model.Admin;
import com.masai.model.AdminSession;

@Service
public interface AdminService {

	public Admin saveAdmin(Admin admin)throws AdminException;
	
	public AdminSession saveAdminLogin(Admin admin) throws AdminException;
}
