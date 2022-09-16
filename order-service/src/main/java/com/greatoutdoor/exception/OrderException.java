package com.greatoutdoor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Exception class for handling the order related exceptions

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class OrderException extends Exception {
	private static final long serialVersionUID = 1L;

	public OrderException(String msg) {
		super(msg);
	}
}