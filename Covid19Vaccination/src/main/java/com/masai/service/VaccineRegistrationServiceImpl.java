package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.VaccineRepositoryException;
import com.masai.exception.UserException;
import com.masai.exception.VaccineRegistrationException;
import com.masai.model.VaccineRepository;
import com.masai.model.UserSession;
import com.masai.model.VaccineRegistration;
import com.masai.repository.SessionDao;
import com.masai.repository.VaccineRegistrationDao;

@Service
public class VaccineRegistrationServiceImpl implements VaccineRegistrationService{

	@Autowired
	private VaccineRegistrationDao vaccineRegistrationDao;
	
	@Autowired
	private SessionDao sDao;
	
	@Override
	public VaccineRegistration saveVaccineRegistration(VaccineRegistration vaccineRegistration ,String key) {
	     
		Optional<UserSession> opt = sDao.findByUuid(key);
		if(opt.isPresent()) {
			 return vaccineRegistrationDao.save(vaccineRegistration);
		}
		else {
			throw new UserException("Invalid User");
		}
	}

	@Override
	public VaccineRegistration getVaccineRegistrationtByVaccineRegistrationId(Integer vaccineRegistrationId) throws VaccineRegistrationException {
		
		return vaccineRegistrationDao.findById(vaccineRegistrationId).orElseThrow(() -> new VaccineRegistrationException("VaccineRegistraion does not exist with this vaccineRegistrationId :"+ vaccineRegistrationId)); 
	}

	@Override
	public VaccineRegistration getVaccineRegistrationtByCity(String city) throws VaccineRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineRegistration getVaccineRegistrationtByState(String state) throws VaccineRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<VaccineRegistration> getAllVaccineRegistration() throws VaccineRegistrationException {
		
		 List<VaccineRegistration> vaccineRegAll = vaccineRegistrationDao.findAll();
			
			if(vaccineRegAll.size() > 0)
				return vaccineRegAll;
			else
				throw new VaccineRegistrationException("No VaccineRegistration found...");
	}

	@Override
	public VaccineRegistration deleteVaccineRegistrationtByvaccineRegistrationId(Integer vaccineRegistrationId)	throws VaccineRegistrationException {
		
		VaccineRegistration existingVaccineReg = vaccineRegistrationDao.findById(vaccineRegistrationId).orElseThrow( () -> new VaccineRegistrationException("VaccineRegistration does not exist with this vaccineRegistrationId :"+vaccineRegistrationId) );
			
		vaccineRegistrationDao.delete(existingVaccineReg);
			
			return existingVaccineReg;
	}

	@Override
	public VaccineRegistration deletegetVaccineRegistrationtByName(String name) throws VaccineRegistrationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration) throws VaccineRegistrationException {
		
		 Optional<VaccineRegistration> opt= vaccineRegistrationDao.findById(vaccineRegistration.getVaccineRegistrationId());
			
			if(opt.isPresent()) {
				
				VaccineRegistration existingVaccine = opt.get();
				
				return vaccineRegistrationDao.save(vaccineRegistration);
				
			}
			else
				throw new VaccineRepositoryException("Invalid VaccineRegistration Details..");
	}

	
	
}
