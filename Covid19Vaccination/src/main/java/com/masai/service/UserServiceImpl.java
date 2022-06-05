package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.User;
import com.masai.repository.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao uDao;

	@Override
	public User saveUser(User user) {
		
		return uDao.save(user);
	}
	
	

}
