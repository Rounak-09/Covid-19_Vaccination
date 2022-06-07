package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.VaccineRepository;

@Repository
public interface VaccineRepositoryDao extends JpaRepository<VaccineRepository,Integer>{

}