package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.VaccineCenter;
import com.masai.model.VaccineRegistration;
import com.masai.service.VaccineRegistrationService;



@RestController
public class VaccineRegistrationController {

	@Autowired
	private VaccineRegistrationService vrService;
	
	// http://localhost:8089/createVaccineRegistration
	// create vaccine center 
	@PostMapping("/vaccineregistration/{key}")
	public ResponseEntity<VaccineRegistration> saveVaccineRegistrationHandler(@RequestBody VaccineRegistration VaccineRegistration , @PathVariable("key") String key){
				
		VaccineRegistration savedRegistration = vrService.saveVaccineRegistration(VaccineRegistration , key);
			
		     return new ResponseEntity<VaccineRegistration >(savedRegistration ,HttpStatus.CREATED);
				
		}
		
	// http://localhost:8089/vaccineRegistration/6
	// get vaccine center  by centerId
	@GetMapping("/vaccineregistration/{vaccineRegistrationId}")
	public VaccineRegistration getVaccineRegistrationByVaccineRegistrationId(@PathVariable("vaccineRegistrationId") Integer vaccineRegistrationId) {
				
			return vrService.getVaccineRegistrationtByVaccineRegistrationId(vaccineRegistrationId);
				
	}
		
	
    // http://localhost:8089/allvaccineRegistration
	// get all available vaccine center
	@GetMapping("/allvaccineregistration")
	public ResponseEntity<List<VaccineRegistration >> getAllVaccineRegistrationDetails(){
				
		
    	List<VaccineRegistration > vaccineRegistrations = vrService.getAllVaccineRegistration();
			
		return new ResponseEntity<List<VaccineRegistration >>(vaccineRegistrations , HttpStatus.OK);
				
	}
			
	// http://localhost:8089/vaccineRegistration/6
	// delete vaccine center  by centerId
	@DeleteMapping("/vaccineregistration/{vaccineRegistrationId}")
	public VaccineRegistration deleteVaccineCenterByVaccineRegistrationId(@PathVariable("vaccineRegistrationId") Integer vaccineRegistrationId){
				
			return vrService.deleteVaccineRegistrationtByvaccineRegistrationId(vaccineRegistrationId);
				
				
	}
		
	// http://localhost:8089/vaccineRegistrations
	// update vaccine center 
	@PutMapping("/vaccineregistrations")
	public ResponseEntity<VaccineRegistration> updateVaccineHub(@RequestBody VaccineCenter vaccinecenter){
				
		VaccineRegistration updatedVaccineRegistration = vrService.updateVaccineRegistration(null);
				
		return new ResponseEntity<VaccineRegistration>(updatedVaccineRegistration ,HttpStatus.ACCEPTED);
				
				
	}	

}
