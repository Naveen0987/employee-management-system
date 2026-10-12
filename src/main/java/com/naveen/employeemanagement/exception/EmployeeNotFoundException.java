package com.naveen.employeemanagement.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;

public class EmployeeNotFoundException extends RuntimeException {


	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
	
	
}
