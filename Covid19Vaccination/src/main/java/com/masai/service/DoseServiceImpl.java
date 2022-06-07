package com.masai.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DoseException;
import com.masai.model.Dose;
import com.masai.repository.DoseDao;

@Service
public class DoseServiceImpl implements DoseService{

	@Autowired
	private DoseDao doseDao;
	
	@Override
	public Dose saveDose(Dose dose) {
		return doseDao.save(dose);
	}

	@Override
	public Dose getDoseByvaccineStatusId(Integer vaccineStatusId) throws DoseException {
		
		return doseDao.findById(vaccineStatusId).orElseThrow(() -> new DoseException("Dose does not exist with this vaccineStatusId :" + vaccineStatusId));
	}

	@Override
	public List<Dose> getAllDoses() throws DoseException {
		
		List<Dose> doses = doseDao.findAll();
		
		if(doses.size() > 0)
			return doses;
		else 
			throw new DoseException("No Dose found...");
	}

	@Override
	public Dose deleteDoseByvaccineStatusId(Integer vaccineStatusId) throws DoseException {
		
		Dose existingDose = doseDao.findById(vaccineStatusId).orElseThrow( () -> new DoseException("Dose does not exist with this vaccineStatusId :" + vaccineStatusId));

		doseDao.delete(existingDose);
		
		return existingDose;
	}

	@Override
	public Dose updateDose(Dose dose) throws DoseException {
		
		 Optional<Dose> opt= doseDao.findById(dose.getVaccineStatusId() );
		 
		 if(opt.isPresent()) {
				
			    Dose existingVaccine = opt.get();
				
				return doseDao.save(dose);
				
			}
			else
				throw new DoseException("Invalid dose Details..");
	}


	
}

