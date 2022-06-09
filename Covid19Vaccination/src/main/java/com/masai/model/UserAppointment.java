package com.masai.model;

import java.time.LocalDate;

import javax.persistence.Column;
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
	
	@Column(name = "userId")
	private Integer userId;
	private String vaccineCenter;
	private LocalDate vaccinationDate;
	private Integer slot;
    private String vaccineName;
    private String vaccineDose;
    
	
	
public UserAppointment(Integer userId, String vaccineCenter, LocalDate vaccinationDate, Integer slot,
			String vaccineName, String vaccineDose) {
		super();
		this.userId = userId;
		this.vaccineCenter = vaccineCenter;
		this.vaccinationDate = vaccinationDate;
		this.slot = slot;
		this.vaccineName = vaccineName;
		this.vaccineDose = vaccineDose;
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
	
	public Integer getAppointmentId() {
		return appointmentId;
	}






	public void setAppointmentId(Integer appointmentId) {
		this.appointmentId = appointmentId;
	}






	public Integer getUserId() {
		return userId;
	}






	public void setUserId(Integer userId) {
		this.userId = userId;
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






	public String getVaccineDose() {
		return vaccineDose;
	}






	public void setVaccineDose(String vaccineDose) {
		this.vaccineDose = vaccineDose;
	}






	public UserAppointment() {
		// TODO Auto-generated constructor stub
		super();
	}
}
