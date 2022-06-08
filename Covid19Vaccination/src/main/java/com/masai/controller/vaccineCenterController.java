package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.VaccineCenter;
import com.masai.service.vaccineCenterService;


@RestController
public class vaccineCenterController {
	
	@Autowired
	private vaccineCenterService vService;
	
	@PostMapping("/vaccinecenters")
	public ResponseEntity<VaccineCenter> savevaccinecenterHandler(@RequestBody VaccineCenter VaccineCenter){
		VaccineCenter savedVaccineCenter = vService.saveVaccineCenter(VaccineCenter);
		return new ResponseEntity<VaccineCenter>(savedVaccineCenter,HttpStatus.CREATED);
	}

}
