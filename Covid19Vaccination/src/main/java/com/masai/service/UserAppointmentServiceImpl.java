package com.masai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserAppointmentException;
import com.masai.model.UserAppointment;
import com.masai.repository.UserAppointmentDao;

@Service
public class UserAppointmentServiceImpl implements UserAppointmentService {
	@Autowired
	private UserAppointmentDao uaDao;

	@Override
	public UserAppointment saveUserAppointment(UserAppointment ua) {
		// TODO Auto-generated method stub
		return uaDao.save(ua);
	}

	@Override
	public UserAppointment getUserAppointmentbyAppointmentId(Integer appointmentId) {
		// TODO Auto-generated method stub
		return uaDao.findById(appointmentId).orElseThrow(()->new UserAppointmentException("No appontmenrt for this is :"+appointmentId));

		
	}

	@Override
	public UserAppointment deleteUserAppointmentbyAppointmentId(Integer appointmentId) {
		// TODO Auto-generated method stub
		UserAppointment exitingAppointment = uaDao.findById(appointmentId).orElseThrow(()->new UserAppointmentException("No appontmenrt for this is :"+appointmentId));
		uaDao.delete(exitingAppointment);
		return exitingAppointment;
	}

	@Override
	public List<UserAppointment> getAllUserAppointments() throws UserAppointmentException {
		// TODO Auto-generated method stub
		List<UserAppointment> userAppointmentAll = uaDao.findAll();
		if(userAppointmentAll.size()>0) {
			return userAppointmentAll;
		}
		else {
			throw new UserAppointmentException("no further appointments");
		}
		
	}

}
