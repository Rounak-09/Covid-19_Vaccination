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
import com.masai.service.VaccineCenterService;



@RestController
public class VaccineCenterController {
	
	@Autowired
	private VaccineCenterService vcService;
	

	// http://localhost:8089/vaccineCenter
	// create vaccine center 
	@PostMapping("/vaccinecenter")
	public ResponseEntity<VaccineCenter> saveVaccineCenterHandler(@RequestBody VaccineCenter vaccinecenter){
			
		VaccineCenter savedVaccineCenter = vcService.saveVaccineCenter( vaccinecenter);
		
	     return new ResponseEntity<VaccineCenter>(savedVaccineCenter ,HttpStatus.CREATED);
			
	}
	
	// http://localhost:8089/vaccineCenter/6
	// get vaccine center  by centerId
	@GetMapping("/vaccinecenter/{centerId}")
	public VaccineCenter getVaccineCenterByCenterId(@PathVariable("centerId") Integer centerId) {
			
		return vcService.getVaccineCenterByCenterId(centerId);
			
	}
		
    // http://localhost:8089/allvaccineCenter
	// get all available vaccine center
	@GetMapping("/allvaccinecenter")
	public ResponseEntity<List<VaccineCenter >> getAllVaccineCenterDetails(){
			
			
    	List<VaccineCenter > vaccineCenters = vcService.getAllVaccineCenter();
			
		return new ResponseEntity<List<VaccineCenter >>(vaccineCenters , HttpStatus.OK);
			
	}
		
    // http://localhost:8089/vaccineCenter/6
	// delete vaccine center  by centerId
	@DeleteMapping("/vaccinecenter/{centerId}")
	public VaccineCenter deleteVaccineCenterByCenterId(@PathVariable("centerId") Integer centerId){
			
		return vcService.deleteVaccineCenterByCenterId(centerId);
			
			
	}
	
	// http://localhost:8089/vaccineCenters
	// update vaccine center 
	@PutMapping("/vaccinecenters")
	public ResponseEntity<VaccineCenter> updateVaccineHub(@RequestBody VaccineCenter vaccinecenter){
			
		VaccineCenter updatedVaccineCenter = vcService.updateVaccineCenter(vaccinecenter);
			
		return new ResponseEntity<VaccineCenter>(updatedVaccineCenter,HttpStatus.ACCEPTED);
			
			
	}
		
//	// http://localhost:8089/vaccines/5?price=50
//	// update vaccine by price
//	@PutMapping("/vaccines/{vaccineId}")
//	public ResponseEntity<VaccineCenter> updateVaccineByPrice(@PathVariable("centerId") Integer centerId,@RequestParam("centerName") Integer price) {
//			
//		VaccineCenter updatedVaccine = vcService.updateVaccineHubByPrice(centerId, price);
//			
//		return new ResponseEntity<VaccineCenter>(updatedVaccine,HttpStatus.ACCEPTED);
//			
//	}
	
	
//		
//	  // update vaccine by quantity
//	  @PutMapping("/vaccines/{vaccineId}")
//	  public ResponseEntity<VaccineHub> updateVaccineByQuantity(@PathVariable("vaccineId") Integer vaccineId,@RequestParam("quantity") Integer quantity) {
//				
//		 VaccineHub updatedVaccine = vhService.updateVaccineHubByQuantity(vaccineId, quantity);
//				
//		 return new ResponseEntity<VaccineHub>(updatedVaccine,HttpStatus.ACCEPTED);
//				
//	 }
		
}
