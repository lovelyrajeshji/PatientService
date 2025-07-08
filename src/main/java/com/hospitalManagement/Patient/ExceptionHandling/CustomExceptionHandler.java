package com.hospitalManagement.Patient.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<ErrorResponse> handleNoSuchElementException(BusinessException b) {
		ErrorResponse ee = new ErrorResponse(400, "No value present", "Invalid input", b.getLocalizedMessage());
		return new ResponseEntity<>(ee, HttpStatus.NOT_FOUND);
	}
}
