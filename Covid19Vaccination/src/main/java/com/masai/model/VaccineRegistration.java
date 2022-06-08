package com.masai.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class VaccineRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vaccineRegistrationId;
	
	private String name;
	private long aadharNo;
	private int age;
	private String gender;
	private LocalDate dob;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private LocalDate dateofregistration;
	private int slot;
	private String vaccineName;
	private boolean does1;
	private boolean dose2;
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="fk_UA")
	private UserAppointment userAppointment;
//	
//	{
//		"name" : "Neha",
//		"aadharNo" : "012345678955" ,
//		"age"  : 23 ,
//		"gender" : "female" ,
//		"dob" :   "2000-05-30" ,
//		"address" : "Patel Nagar" ,
//		"city"  : "Patna" ,
//		"State" : "Bihar" ,
//		"pincode" : "12456" ,
//		"dateofregistration" : "2022-06-10",
//		"slot" : 1 ,
//		"vaccineName" : "CovidShield" ,
//		"dose1" : true ,
//		"dose2" : false
//			
//	}
	
	public VaccineRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getVaccineRegistrationId() {
		return vaccineRegistrationId;
	}

	public void setVaccineRegistrationId(int vaccineRegistrationId) {
		this.vaccineRegistrationId = vaccineRegistrationId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public LocalDate getDateofregistration() {
		return dateofregistration;
	}

	public void setDateofregistration(LocalDate dateofregistration) {
		this.dateofregistration = dateofregistration;
	}

	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public boolean isDoes1() {
		return does1;
	}

	public void setDoes1(boolean does1) {
		this.does1 = does1;
	}

	public boolean isDose2() {
		return dose2;
	}

	public void setDose2(boolean dose2) {
		this.dose2 = dose2;
	}

	public UserAppointment getUserAppointment() {
		return userAppointment;
	}

	public void setUserAppointment(UserAppointment userAppointment) {
		this.userAppointment = userAppointment;
	}

	public VaccineRegistration(int vaccineRegistrationId, String name, long aadharNo, int age, String gender,
			LocalDate dob, String address, String city, String state, String pincode, LocalDate dateofregistration,
			int slot, String vaccineName, boolean does1, boolean dose2, UserAppointment userAppointment) {
		super();
		this.vaccineRegistrationId = vaccineRegistrationId;
		this.name = name;
		this.aadharNo = aadharNo;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.dateofregistration = dateofregistration;
		this.slot = slot;
		this.vaccineName = vaccineName;
		this.does1 = does1;
		this.dose2 = dose2;
		this.userAppointment = userAppointment;
	}


	
	
	



	
	
}

