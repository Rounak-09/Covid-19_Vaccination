package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer userId;
	private String name;
	private String email;
	private Long mobile;
	private String password;
	
	public User() {
		super();
	}

	public Integer getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(Integer userId, String name, String email, Long mobile, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	
	
}
