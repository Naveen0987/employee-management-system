package com.naveen.employeemanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<String> handleEmployeeNotFoundException(EmployeeNotFoundException exception) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());

	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
		StringBuilder messages = new StringBuilder();
		List<FieldError> errors = exception.getBindingResult().getFieldErrors();
		for (FieldError error : errors) {
			messages.append(error.getField()).append(": ").append(error.getDefaultMessage()).append("\n");

		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(messages.toString().trim());

	}
}
