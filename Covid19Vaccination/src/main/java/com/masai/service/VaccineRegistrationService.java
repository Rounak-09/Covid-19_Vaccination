package com.masai.service;

import java.util.List;

import com.masai.exception.VaccineRegistrationException;
import com.masai.model.VaccineRegistration;



public interface VaccineRegistrationService {

	    public VaccineRegistration saveVaccineRegistration(VaccineRegistration vaccineRegistration , String key);
	    
	    public VaccineRegistration getVaccineRegistrationtByVaccineRegistrationId(Integer vaccineRegistrationId) throws VaccineRegistrationException;
	    
	    public VaccineRegistration getVaccineRegistrationtByCity(String city) throws VaccineRegistrationException;
	    
	    public VaccineRegistration getVaccineRegistrationtByState(String state) throws VaccineRegistrationException;
	    
	    public List<VaccineRegistration> getAllVaccineRegistration() throws VaccineRegistrationException;
	    
	    public VaccineRegistration deleteVaccineRegistrationtByvaccineRegistrationId(Integer vaccineRegistrationId) throws VaccineRegistrationException;
	    
	    public VaccineRegistration deletegetVaccineRegistrationtByName(String name) throws VaccineRegistrationException;
	    
	    public VaccineRegistration updateVaccineRegistration(VaccineRegistration vaccineRegistration) throws VaccineRegistrationException;
	    
	
}
