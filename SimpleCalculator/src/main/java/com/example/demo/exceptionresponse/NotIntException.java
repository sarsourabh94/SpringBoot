package com.example.demo.exceptionresponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotIntException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	public NotIntException(String exceptionMessage)
	{
		super(exceptionMessage);
	}

}
