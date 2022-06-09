package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Admin;
import com.masai.model.AdminSession;
import com.masai.model.User;
import com.masai.model.UserSession;
import com.masai.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService aService;

	@PostMapping("/admin/signup")
	public ResponseEntity<Admin> saveAdminHandler(@RequestBody Admin admin){
		
		Admin savedAdmin = aService.saveAdmin(admin);
		
		return new ResponseEntity<Admin>(savedAdmin,HttpStatus.CREATED);
	}
	
	@GetMapping("/admin/login")
	public ResponseEntity<AdminSession> getAdminHandler(@RequestBody Admin admin){
		
		AdminSession adminLoggedin = aService.saveAdminLogin(admin);
		
		return new ResponseEntity<AdminSession>(adminLoggedin,HttpStatus.ACCEPTED);
	}
}
