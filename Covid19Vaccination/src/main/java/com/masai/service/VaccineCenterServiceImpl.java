package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.VaccineCenterException;
import com.masai.model.VaccineCenter;
import com.masai.repository.VaccineCenterDao;

@Service
public class VaccineCenterServiceImpl implements VaccineCenterService {

	@Autowired
	private VaccineCenterDao vaccineCenterDao;
	
	@Override
	public VaccineCenter saveVaccineCenter(VaccineCenter vaccinecenter) {
		
		return vaccineCenterDao.save(vaccinecenter);
	}

	@Override
	public VaccineCenter getVaccineCenterByCenterId(Integer centerId) throws VaccineCenterException {
		
		return vaccineCenterDao.findById(centerId).orElseThrow(() -> new VaccineCenterException("Vaccine Center does not exist with this centerId :"+ centerId)); 
	}

	@Override
	public VaccineCenter getVaccineCenterByCenterName(String centerName) throws VaccineCenterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VaccineCenter> getAllVaccineCenter() throws VaccineCenterException {
		
		 List<VaccineCenter> vaccineCenters = vaccineCenterDao.findAll();
			
			if(vaccineCenters.size() > 0)
				return vaccineCenters;
			else
				throw new VaccineCenterException("No Vaccine Center found...");
	}

	@Override
	public VaccineCenter deleteVaccineCenterByCenterId(Integer centerId) throws VaccineCenterException {
		
		VaccineCenter existingVaccineCenter = vaccineCenterDao.findById(centerId).orElseThrow( () -> new VaccineCenterException("Vaccine Center does not exist with this centerId :"+ centerId) );
			
	    vaccineCenterDao.delete(existingVaccineCenter);
			
			return existingVaccineCenter;
	}

	@Override
	public VaccineCenter deleteVaccineCenterByCenterName(String centerName) throws VaccineCenterException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineCenter updateVaccineCenter(VaccineCenter vaccineCenter) throws VaccineCenterException {
		
		 Optional<VaccineCenter> opt= vaccineCenterDao.findById(vaccineCenter.getCenterId() );
			
			if(opt.isPresent()) {
				
				VaccineCenter existingVaccineCenter = opt.get();
				
				return vaccineCenterDao.save(vaccineCenter);
				
			}
			else
				throw new VaccineCenterException("Invalid Vaccine Center Details..");
	}



}
