package com.masai.service;

import java.util.List;
import com.masai.exception.UserAppointmentException;
import com.masai.model.UserAppointment;

public interface UserAppointmentService {
	public UserAppointment saveUserAppointment(UserAppointment ua);
    public UserAppointment getUserAppointmentbyAppointmentId(Integer appointmentId);
    public UserAppointment deleteUserAppointmentbyAppointmentId(Integer appointmentId);
    public List<UserAppointment> getAllUserAppointments()throws UserAppointmentException;
}
