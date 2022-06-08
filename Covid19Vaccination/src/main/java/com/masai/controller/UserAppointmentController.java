package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.UserAppointment;
import com.masai.service.UserAppointmentService;

@RestController
public class UserAppointmentController{
	@Autowired
	private UserAppointmentService uaService;
	///localhost:8089/createUserAppointment
	@PostMapping("/createUserAppointment")
	public ResponseEntity<UserAppointment> saveUserAppointmentHandler(@RequestBody UserAppointment ua){
		UserAppointment savedAppointment = uaService.saveUserAppointment(ua);
		return new ResponseEntity<UserAppointment>(savedAppointment,HttpStatus.CREATED);
	}
   ///localhost:8089/userAppointment/23
	@GetMapping("/userAppointment/{appointmentId}")
	public UserAppointment getUserAppointmentbyUserAppointmentIdHandler(@PathVariable("appointmentId") Integer appointmentId) {
		return uaService.getUserAppointmentbyAppointmentId(appointmentId);
	}
	//localhost:8088/delete/user/23
	@DeleteMapping("/delete/user/{appointmentId}")
	public UserAppointment deleteUserApointmentbyIdhandler(@PathVariable("appointmentId") Integer appointmentId) {
		return uaService.deleteUserAppointmentbyAppointmentId(appointmentId);
	}
	//localhost:8088/allAppointments
	@GetMapping("/allAppointments")
	public ResponseEntity<List<UserAppointment>> getAllAppointmentsHandler(){
		List<UserAppointment> allAppoinments = uaService.getAllUserAppointments();
		return new ResponseEntity<List<UserAppointment>>(allAppoinments,HttpStatus.OK);
	}
	
}
