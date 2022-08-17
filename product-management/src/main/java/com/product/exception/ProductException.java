package com.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductException extends RuntimeException {

	private static final long serialVersionUID = 1l;
	private String productName;
	private String fieldName;
	private Object fieldValue;
	// System.out.println(String.format("%s not found %s:
	// '%s'",resourceName,fieldName,fieldValue));

	public ProductException(String productName, String fieldName, Object fieldValue) {
		super();
		this.productName = productName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getProductName() {
		return productName;
	}

	public String getfieldName() {
		return fieldName;
	}

	public String getfieldValue() {
		return (String) fieldValue;
	}

}
