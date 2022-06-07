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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.VaccineRepository;
import com.masai.service.VaccineRepositoryService;



@RestController
public class VaccineRepositoryController {

	@Autowired
	private VaccineRepositoryService vhService;
	
	
	// http://localhost:8089/vaccine
	// create vaccine 
	@PostMapping("/vaccine")
	public ResponseEntity<VaccineRepository> saveVaccineHubHandler(@RequestBody VaccineRepository vaccinehub){
		
		VaccineRepository savedVaccineHub = vhService.saveVaccineHub(vaccinehub);
	
		
		return new ResponseEntity<VaccineRepository>(savedVaccineHub,HttpStatus.CREATED);
		
	}
	
	// http://localhost:8089/vaccine/5
	// get vaccine by vaccineId
	@GetMapping("/vaccine/{vaccineId}")
	public VaccineRepository getVaccineHubByVaccineId(@PathVariable("vaccineId") Integer vaccineId) {
		
		return vhService.getVaccineHubByVaccineId(vaccineId);
		
	}
	
	// http://localhost:8089/allvaccine
	// get all available vaccine
	@GetMapping("/allvaccine")
	public ResponseEntity<List<VaccineRepository>> getAllVaccineHubDetails(){
		
		
		List<VaccineRepository> vaccines = vhService.getAllVaccineHub();
		
		
		return new ResponseEntity<List<VaccineRepository>>(vaccines , HttpStatus.OK);
		
	}
	
    // http://localhost:8089/vaccine/5
	// delete vaccine  by vaccineId
	@DeleteMapping("/vaccine/{vaccineId}")
	public VaccineRepository deleteVaccineHubHandler(@PathVariable("vaccineId") Integer vaccineId){
		
		return vhService.deleteVaccineHubByVaccineId(vaccineId);
		
    }
	
	// http://localhost:8089/vaccines
	// update vaccine 
	@PutMapping("/vaccines")
	 public ResponseEntity<VaccineRepository> updateVaccineHub(@RequestBody VaccineRepository vaccinehub){
		
		VaccineRepository updatedVaccine = vhService.updateVaccineHub(vaccinehub);
		
		return new ResponseEntity<VaccineRepository>(updatedVaccine,HttpStatus.ACCEPTED);
		
		
	}

     // http://localhost:8089/vaccines/5?price=50
    // update vaccine by price
	@PutMapping("/vaccines/{vaccineId}")
	 public ResponseEntity<VaccineRepository> updateVaccineByPrice(@PathVariable("vaccineId") Integer vaccineId,@RequestParam("price") Integer price) {
		
		VaccineRepository updatedVaccine = vhService.updateVaccineHubByPrice(vaccineId, price);
		
		return new ResponseEntity<VaccineRepository>(updatedVaccine,HttpStatus.ACCEPTED);
		
	}
	
    //  http://localhost:8089/vaccinesquantity/10?quantity=5
	// update vaccine by quantity
	@PutMapping("/vaccinesquantity/{vaccineId}")
	public ResponseEntity<VaccineRepository> updateVaccineByQuantity(@PathVariable("vaccineId") Integer vaccineId,@RequestParam("quantity") Integer quantity) {
			
		VaccineRepository updatedVaccine = vhService.updateVaccineHubByQuantity(vaccineId, quantity);
			
		return new ResponseEntity<VaccineRepository>(updatedVaccine,HttpStatus.ACCEPTED);
			
	}
	
}
