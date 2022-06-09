package com.masai.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Dose {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vaccineStatusId;
	
	@Column(name = "userId")
	private Integer userId;
	private boolean dose1;
	private boolean dose2;
	private LocalDate dose1Date;
	private LocalDate dose2Date;
	
	
	public Dose(Integer userId, boolean dose1, boolean dose2, LocalDate dose1Date, LocalDate dose2Date) {
		super();
		this.userId = userId;
		this.dose1 = dose1;
		this.dose2 = dose2;
		this.dose1Date = dose1Date;
		this.dose2Date = dose2Date;
	}
	
	public int getVaccineStatusId() {
		return vaccineStatusId;
	}
	public void setVaccineStatusId(int vaccineStatusId) {
		this.vaccineStatusId = vaccineStatusId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public boolean isDose1() {
		return dose1;
	}
	public void setDose1(boolean dose1) {
		this.dose1 = dose1;
	}
	public boolean isDose2() {
		return dose2;
	}
	public void setDose2(boolean dose2) {
		this.dose2 = dose2;
	}
	public LocalDate getDose1Date() {
		return dose1Date;
	}
	public void setDose1Date(LocalDate dose1Date) {
		this.dose1Date = dose1Date;
	}
	public LocalDate getDose2Date() {
		return dose2Date;
	}
	public void setDose2Date(LocalDate dose2Date) {
		this.dose2Date = dose2Date;
	}
	
	
	
}