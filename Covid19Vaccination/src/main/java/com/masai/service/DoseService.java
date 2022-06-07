package com.masai.service;

import java.util.List;

import com.masai.exception.DoseException;
import com.masai.model.Dose;


public interface DoseService {
    
    public Dose saveDose(Dose dose);
    
    public Dose getDoseByvaccineStatusId(Integer vaccineStatusId) throws DoseException;
    
    public List<Dose> getAllDoses() throws DoseException;
    
    public Dose deleteDoseByvaccineStatusId(Integer vaccineStatusId) throws DoseException;
    
    public Dose updateDose(Dose dose) throws DoseException;
       
}

