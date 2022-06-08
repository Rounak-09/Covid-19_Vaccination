package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.exception.AdminException;
import com.masai.model.Admin;
import com.masai.model.AdminSession;

@Repository
public interface AdminSessionDao extends JpaRepository<Admin, Integer> {

	public AdminSession save(AdminSession adminSession)throws AdminException;
}
