package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class EmployeeException extends RuntimeException {
	
	private static final long serialVersionUID = 1l;
	private String firstName;
	private String fieldName;
	private Object fieldValue;
	
	public EmployeeException(String firstName, String fieldName, Object fieldValue) {
		super();
		this.firstName = firstName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Object getFieldValue() {
		return fieldValue;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public void setFieldValue(Object fieldValue) {
		this.fieldValue = fieldValue;
	}
	
	public EmployeeException(String message) {
		super(message);
	}
	
	
	

}
