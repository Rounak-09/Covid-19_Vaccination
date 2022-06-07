package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.VaccineRegistration;
import com.masai.service.VaccineRegistrationService;
@RestController
public class VaccineRegistrationController {
	@Autowired
    private VaccineRegistrationService vrs;
	
	@PostMapping("/details")
	public ResponseEntity<VaccineRegistration> saveUserDetails(@RequestBody VaccineRegistration vr){
	        VaccineRegistration savedUserDetails = vrs.saveVRDetails(vr);
	      //  System.out.println(savedUserDetails);
	        return new ResponseEntity<VaccineRegistration>(savedUserDetails,HttpStatus.CREATED);
	}
	
    
    
}
