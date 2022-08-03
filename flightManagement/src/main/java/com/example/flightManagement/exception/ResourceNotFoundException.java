package com.example.flightManagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID=1l;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	//System.out.println(String.format("%s not found %s: '%s'",resourceName,fieldName,fieldValue));
	
	
	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
		super();
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	
	public String getfieldName() {
		return fieldName;
	}
	public String getfieldValue() {
		return (String) fieldValue;
	}
	
}
