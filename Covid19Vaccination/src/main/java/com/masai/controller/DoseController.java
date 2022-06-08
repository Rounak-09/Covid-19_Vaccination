package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Dose;
import com.masai.service.DoseService;

import java.util.List;

@RestController
public class DoseController {

	
	@Autowired
	private DoseService doseService;
	
	// http://localhost:8089/createDose
	// create dose
	@PostMapping("/admin/createdose")
	public ResponseEntity<Dose> saveDoseHandler(@RequestBody Dose dose){
		
		Dose savedDose= doseService.saveDose(dose);
	
		return new ResponseEntity<Dose>(savedDose,HttpStatus.CREATED);
		
	}
	
	// http://localhost:8089/dose/26
	// get dose by dose id
	@GetMapping("/dose/{vaccineStatusId}")
	public Dose ggetDoseByvaccineStatusId(@PathVariable("vaccineStatusId") Integer vaccineStatusId) {
		
		return doseService.getDoseByvaccineStatusId(vaccineStatusId);
		
	}
	
	
//	// http://localhost:8089/doses
//	// get all doses
//	@GetMapping("/doses")
//	public ResponseEntity<List<Dose>> getAllVaccineRegistrationDetails(){
//		
//		
//		List<Dose> doses = doseService.getAllDoses();
//		
//		return new ResponseEntity<List<Dose>>(doses, HttpStatus.OK);
//		
//	}
	
	
	// http://localhost:8089/updateDose
	// update dose by id
	@PutMapping("/admin/updatedose")
	public Dose updateDoseByUsingId(@RequestBody Dose dose) {
		
		return doseService.updateDose(dose);
	}
		
	
}

