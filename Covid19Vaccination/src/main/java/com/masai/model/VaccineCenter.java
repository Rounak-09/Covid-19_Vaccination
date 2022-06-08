package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class VaccineCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int centerId;
	
	private String centerName;
	private String city;
	private String state;
	
	public VaccineCenter() {
		super();
		
	}
	public VaccineCenter(int centerId, String centerName, String city, String state) {
		super();
		this.centerId = centerId;
		this.centerName = centerName;
		this.city = city;
		this.state = state;
	}
	public int getCenterId() {
		return centerId;
	}
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	public String getCenterName() {
		return centerName;
	}
	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
