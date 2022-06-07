package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.VaccineCenter;

@Repository
public interface VaccineCenterDao extends JpaRepository<VaccineCenter,Integer>{

}

