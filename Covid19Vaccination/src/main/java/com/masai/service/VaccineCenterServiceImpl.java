package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.masai.model.VaccineCenter;

import com.masai.repository.vaccineCenterDao;

@Service
public  class VaccineCenterServiceImpl implements vaccineCenterService{
	
	@Autowired
	private vaccineCenterDao vcDao;

	

	@Override
	public VaccineCenter saveVaccineCenter(VaccineCenter vaccinecenter) {
		return vcDao.save(vaccinecenter);
	}
	
	

}
