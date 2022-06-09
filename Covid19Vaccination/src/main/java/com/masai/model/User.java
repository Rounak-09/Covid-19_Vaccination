package com.masai.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")
	private Integer userId;
	
	
	private String name;
	
	@Email(message="Enter valid email")
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
