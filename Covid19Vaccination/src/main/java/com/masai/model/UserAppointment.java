package com.masai.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
public class UserAppointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer appointmentId;
	private String vaccineCenter;
	private LocalDate vaccinationDate;
	private Integer slot;
    private String vaccineName;
    private boolean dose1;
	private boolean dose2;
	public Integer getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getVaccineCenter() {
		return vaccineCenter;
	}
	public void setVaccineCenter(String vaccineCenter) {
		this.vaccineCenter = vaccineCenter;
	}
	public LocalDate getVaccinationDate() {
		return vaccinationDate;
	}
	public void setVaccinationDate(LocalDate vaccinationDate) {
		this.vaccinationDate = vaccinationDate;
	}
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public String getVaccineName() {
		return vaccineName;
	}
	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
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
	public UserAppointment( String vaccineCenter, LocalDate vaccinationDate, Integer slot,
			String vaccineName, boolean dose1, boolean dose2) {
		super();
		
		this.vaccineCenter = vaccineCenter;
		this.vaccinationDate = vaccinationDate;
		this.slot = slot;
		this.vaccineName = vaccineName;
		this.dose1 = dose1;
		this.dose2 = dose2;
	}
	
	
	
	
//	{
//	"appointmentId" : "01",
//	"vaccineCenter" : "riper" ,
//	"vaccinationDate" : "2022-06-10",
//	"slot" : 1 ,
//	"vaccineName" : "CovidShield" ,
//	"dose1" : true ,
//	"dose2" : false
//		
//}
	
	public UserAppointment() {
		// TODO Auto-generated constructor stub
		super();
	}
}
