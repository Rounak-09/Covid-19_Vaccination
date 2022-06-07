package com.masai.service;

import java.util.List;

import com.masai.exception.VaccineRepositoryException;
import com.masai.model.VaccineRepository;

public interface VaccineRepositoryService {

	
    public VaccineRepository saveVaccineHub(VaccineRepository vaccinehub);
    
    public VaccineRepository getVaccineHubByVaccineId(Integer vaccineId) throws VaccineRepositoryException;
    
    public VaccineRepository getVaccineHubByVaccineName(String vaccineName) throws VaccineRepositoryException;
    
    public List<VaccineRepository> getAllVaccineHub() throws VaccineRepositoryException;
    
    public VaccineRepository deleteVaccineHubByVaccineId(Integer vaccineId) throws VaccineRepositoryException;
    
    public VaccineRepository deleteVaccineHubByVaccineName(String vaccineName) throws VaccineRepositoryException;
    
    public VaccineRepository updateVaccineHub(VaccineRepository vaccinehub) throws VaccineRepositoryException;
    
    public VaccineRepository updateVaccineHubByQuantity(Integer vaccineId , Integer gracequantiy)throws VaccineRepositoryException;
    
    public VaccineRepository updateVaccineHubByPrice(Integer vaccineId , Integer graceprice)throws VaccineRepositoryException;
}
