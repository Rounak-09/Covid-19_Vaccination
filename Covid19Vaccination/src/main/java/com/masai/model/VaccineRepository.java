package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class VaccineRepository {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vaccineId;
	
	private String vaccineName;
	private int vaccinePrice;
	private int quantity;
	
	public VaccineRepository(int vaccineId , String vaccineName, int vaccinePrice, int quantity) {
		super();
		this.vaccineId = vaccineId;
		this.vaccineName = vaccineName;
		this.vaccinePrice = vaccinePrice;
		this.quantity = quantity;
	}

	
	public VaccineRepository() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getVaccineId() {
		return vaccineId;
	}

	public void setVaccineId(int vaccineId) {
		this.vaccineId = vaccineId;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public int getVaccinePrice() {
		return vaccinePrice;
	}

	public void setVaccinePrice(int vaccinePrice) {
		this.vaccinePrice = vaccinePrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	
	
	
}
