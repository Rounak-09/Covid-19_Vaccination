package com.masai.service;

import java.util.List;

import com.masai.exception.VaccineCenterException;
import com.masai.model.VaccineCenter;


public interface VaccineCenterService {

	
    public VaccineCenter saveVaccineCenter(VaccineCenter vaccineCenter);
    
    public VaccineCenter getVaccineCenterByCenterId(Integer centerId) throws VaccineCenterException;
    
    public VaccineCenter getVaccineCenterByCenterName(String centerName) throws VaccineCenterException;
    
    public List<VaccineCenter> getAllVaccineCenter() throws VaccineCenterException;
    
    public VaccineCenter deleteVaccineCenterByCenterId(Integer centerId) throws VaccineCenterException;
    
    public VaccineCenter deleteVaccineCenterByCenterName(String centerName) throws VaccineCenterException;
    
    public VaccineCenter updateVaccineCenter(VaccineCenter vaccineCenter) throws VaccineCenterException;
    
//  public VaccineCenter updateVaccineHubByQuantity(Integer centerId , Integer gracequantiy)throws VaccineCenterException;
//    
//  public VaccineCenter updateVaccineHubByPrice(Integer centerId , Integer graceprice)throws VaccineCenterException;
}
