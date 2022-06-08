package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer adminId;
	private String name;
	private String email;
	private Long phone;
	private String password;
	
	
	public Admin(Integer adminId, String name, String email, Long phone, String password) {
		super();
		this.adminId = adminId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}

	public Admin() {
		super();
	}

	
	public Long getPhone() {
		return phone;
	}



	public void setPhone(Long phone) {
		this.phone = phone;
	}



	public Integer getAdminId() {
		return adminId;
	}



	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
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



	


	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}

}
