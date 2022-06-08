package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.UserAppointment;
@Repository
public interface UserAppointmentDao extends JpaRepository<UserAppointment, Integer> {

}
