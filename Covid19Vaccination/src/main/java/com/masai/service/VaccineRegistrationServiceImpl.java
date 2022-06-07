package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.VaccineRegistration;
import com.masai.repository.VaccineRegistrationDao;
@Service
public class VaccineRegistrationServiceImpl implements VaccineRegistrationService{
	@Autowired
	private VaccineRegistrationDao vrDao;
	

	@Override
	public VaccineRegistration saveVRDetails(VaccineRegistration vr) {
		// TODO Auto-generated method stub
		
		
		return vrDao.save(vr);
	}

}
