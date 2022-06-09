package com.masai.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VaccineRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vaccineRegistrationId;
	
	@Column(name = "userId")
	private Integer userId;
	private String name;
	private long aadharNo;
	private Integer age;
	private String gender;
	private LocalDate dob;
	private String address;
	private String city;
	private String state;
	private String pincode;
	private LocalDate dateofregistration;
	private Integer slot;
	private String vaccineName;
	private String vaccineDose;
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="userId")
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

	
}

