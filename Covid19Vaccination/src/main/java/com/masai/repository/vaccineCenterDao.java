package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.masai.model.VaccineCenter;

public interface vaccineCenterDao extends JpaRepository<VaccineCenter,Integer>{

}
