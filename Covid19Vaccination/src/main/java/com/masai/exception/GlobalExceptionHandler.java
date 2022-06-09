package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;


@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(AdminException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(AdminException ie,WebRequest wr)  {
		System.out.println("AdminException");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		
	
	 return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);		
		
	}
	@ExceptionHandler(DoseException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(DoseException ie,WebRequest wr)  {
		System.out.println("DoseException");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		
	
	 return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);		
		
	}
	@ExceptionHandler(UserAppointmentException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(UserAppointmentException ie,WebRequest wr)  {
		System.out.println("UserAppointmentException");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		
	
	 return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);		
		
	}
	@ExceptionHandler(UserException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(UserException ie,WebRequest wr)  {
		System.out.println("UserException");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		
	
	 return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);		
		
	}
	@ExceptionHandler(VaccineCenterException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(VaccineCenterException ie,WebRequest wr)  {
		System.out.println("VaccineCenterException");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		
	
	 return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);		
		
	}
	@ExceptionHandler(VaccineRegistrationException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(VaccineRegistrationException ie,WebRequest wr)  {
		System.out.println("VaccineRegistrationException");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		
	
	 return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);		
		
	}
	@ExceptionHandler( VaccineRepositoryException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler( VaccineRepositoryException ie,WebRequest wr)  {
		System.out.println("VaccineRepositoryException");
		
		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		
		
	
	 return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);		
		
	}
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req)  {
		System.out.println("NoHandlerFoundException");

		MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));

	return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
				
}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExpHandlerMain(Exception ie,WebRequest wr)  {
		System.out.println("Exception");
		

		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
				
	
	 return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);	
	 
				
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myMANVExceptionHandler(MethodArgumentNotValidException me) {
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),"Validation Error",me.getBindingResult().getFieldError().getDefaultMessage());
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}

	
	
}
