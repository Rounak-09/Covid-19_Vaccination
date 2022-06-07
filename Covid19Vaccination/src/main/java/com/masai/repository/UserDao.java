package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.masai.model.User;

public interface UserDao extends JpaRepository<User,Integer>{
	
	public User findByMobile(Long mobile);
	
	public User getByUserId(Integer userId);
	
//	public User updateUser(User user, String key);

}
