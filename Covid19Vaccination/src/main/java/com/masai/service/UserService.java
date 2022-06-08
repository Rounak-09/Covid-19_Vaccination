package com.masai.service;

import com.masai.exception.UserException;

import com.masai.model.User;
import com.masai.model.UserSession;

public interface UserService {
	
	public User saveUser(User user)throws UserException;
	
	public UserSession saveLogin(User user)throws UserException;
	
	public String deleteSession(String key)throws UserException;
	
	public User updateUser(User user, String key)throws UserException;
}
