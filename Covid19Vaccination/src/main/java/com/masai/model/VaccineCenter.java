package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class VaccineCenter {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer CenterId;
	private String CenterName;
	private String city;
	private String state;
	
	public VaccineCenter() {
		super();
	}

	public Integer getCenterId() {
		return CenterId;
	}

	public void setCenterId(Integer CenterId) {
		this.CenterId = CenterId;
	}


	
	public void setCenterName(String CenterName) {
		this.CenterName = CenterName;
	}
	public String getCenterName() {
		return CenterName;
	}

	public void setstate(String state) {
		this.state = state;
	}
	public String getstate() {
		return state;
	}

	public void setcity(String city) {
		this.city = city;
	}
	public String getcity() {
		return city;
	}

	
	
}
