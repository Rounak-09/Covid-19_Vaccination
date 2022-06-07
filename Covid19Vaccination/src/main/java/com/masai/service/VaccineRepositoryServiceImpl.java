package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.VaccineRepositoryException;
import com.masai.model.VaccineRepository;
import com.masai.repository.VaccineRepositoryDao;


@Service
public class VaccineRepositoryServiceImpl implements VaccineRepositoryService{

	@Autowired
	private VaccineRepositoryDao vaccineHubDao;
	
	@Override
	public VaccineRepository saveVaccineHub(VaccineRepository vaccinehub) {
		
		return vaccineHubDao.save(vaccinehub);
	}

	@Override
	public VaccineRepository getVaccineHubByVaccineId(Integer vaccineId) throws VaccineRepositoryException {
		
		return vaccineHubDao.findById(vaccineId).orElseThrow(() -> new VaccineRepositoryException("Vaccine does not exist with this vaccineId :"+ vaccineId)); 
	}

	@Override
	public VaccineRepository getVaccineHubByVaccineName(String vaccineName) throws VaccineRepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VaccineRepository> getAllVaccineHub() throws VaccineRepositoryException {
		
	  List<VaccineRepository> vaccines = vaccineHubDao.findAll();
		
		if(vaccines.size() > 0)
			return vaccines;
		else
			throw new VaccineRepositoryException("No Vaccine found...");
	}

	@Override
	public VaccineRepository deleteVaccineHubByVaccineId(Integer vaccineId) throws VaccineRepositoryException {
		
       VaccineRepository existingVaccine = vaccineHubDao.findById(vaccineId).orElseThrow( () -> new VaccineRepositoryException("Vaccine does not exist with this vaccineId :"+vaccineId) );
		
       vaccineHubDao.delete(existingVaccine);
		
		return existingVaccine;
	}

	@Override
	public VaccineRepository deleteVaccineHubByVaccineName(String vaccineName) throws VaccineRepositoryException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VaccineRepository updateVaccineHub(VaccineRepository vaccinehub) throws VaccineRepositoryException {
       Optional<VaccineRepository> opt= vaccineHubDao.findById(vaccinehub.getVaccineId() );
		
		if(opt.isPresent()) {
			
			VaccineRepository existingVaccine = opt.get();
			
			return vaccineHubDao.save(vaccinehub);
			
		}
		else
			throw new VaccineRepositoryException("Invalid Vaccine Details..");
	}

	@Override
	public VaccineRepository updateVaccineHubByQuantity(Integer vaccineId, Integer graceQuantity) throws VaccineRepositoryException {
	  Optional<VaccineRepository> opt= vaccineHubDao.findById(vaccineId);
		
		if(opt.isPresent()) {
			
			VaccineRepository existingVaccine = opt.get();
			
			
			existingVaccine .setQuantity(existingVaccine.getQuantity()+graceQuantity);
			
			return vaccineHubDao.save(existingVaccine );
			
			
		}else
			throw new VaccineRepositoryException("Vaccine does not exist with this vaccineId :"+vaccineId);
	}

	@Override
	public VaccineRepository updateVaccineHubByPrice(Integer vaccineId, Integer gracePrice)  throws VaccineRepositoryException {
		
		 Optional<VaccineRepository> opt= vaccineHubDao.findById(vaccineId);
			
			if(opt.isPresent()) {
				
				VaccineRepository existingVaccine = opt.get();
				
				
				existingVaccine .setVaccinePrice(existingVaccine.getVaccinePrice()+gracePrice);
				
				return vaccineHubDao.save(existingVaccine );
				
				
			}else
				throw new VaccineRepositoryException("Vaccine does not exist with this vaccineId :"+vaccineId);
	}

	

}
