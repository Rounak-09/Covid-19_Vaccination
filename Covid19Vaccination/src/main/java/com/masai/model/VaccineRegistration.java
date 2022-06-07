package com.masai.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 @Entity
public class VaccineRegistration {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer registrationId; 
	private String name;
	private Long addharNumber;
	private Integer age;
	private String gender;
	private Long dob;
	private String city;
	private String state;
	private Long pincode;
	private String vaccinationDate;
	private Integer slot;
	private String vaccineName;
	private String dose  ;

//    "name":"vikas",
//    "addharNumber":456987,
//    "age":21,
//    "gender":"male",
//    "dob":456987,
//    "city":"hapur",
//    "state":"haryana",
//    "pincode":245304,
//    "vaccinationDate":"2019-02-05",
//    "slot":1,
//    "vaccineName":"x",
//    "dose":"1"
	public Integer getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAddharNumber() {
		return addharNumber;
	}
	public void setAddharNumber(Long addharNumber) {
		this.addharNumber = addharNumber;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getDob() {
		return dob;
	}
	public void setDob(Long dob) {
		this.dob = dob;
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
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public String getVaccinationDate() {
		return vaccinationDate;
	}
	public void setVaccinationDate(String vaccinationDate) {
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
	public String getDose() {
		return dose;
	}
	public void setDose(String dose) {
		this.dose = dose;
	}
	
	
	 public VaccineRegistration() {
		// TODO Auto-generated constructor stub
		 super();
	}
//	public VaccineRegistration(Integer registrationId, String name, Long addharNumber, Integer age, String gender,
//			Long dob, String city, String state, Long pincode, String vaccinationDate, Integer slot, String vaccineName,
//			String dose) {
//		super();
//		this.registrationId = registrationId;
//		this.name = name;
//		this.addharNumber = addharNumber;
//		this.age = age;
//		this.gender = gender;
//		this.dob = dob;
//		this.city = city;
//		this.state = state;
//		this.pincode = pincode;
//		this.vaccinationDate = vaccinationDate;
//		this.slot = slot;
//		this.vaccineName = vaccineName;
//		this.dose = dose;
//	}
	
//	{
//	    "name":"vikas",
//	    "addharNumber":456987,
//	    "age":21,
//	    "gender":"male",
//	    "dob":456987,
//	    "city":"hapur",
//	    "state":"haryana",
//	    "pincode":245304,
//	    "vaccinationDate":"12/12/12",
 //     "slot":1,
  //    "vaccineName":"x"
//	    "dose":"1"

	}
	


