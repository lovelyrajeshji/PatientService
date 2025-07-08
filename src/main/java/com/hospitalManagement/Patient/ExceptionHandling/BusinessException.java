package com.hospitalManagement.Patient.ExceptionHandling;

import java.util.NoSuchElementException;

import lombok.Data;

@Data
public class BusinessException extends NoSuchElementException {
	private final String errorCode;

	public BusinessException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	// getters
}
