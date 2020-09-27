package com.example.demo.exceptionresponse.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.exceptionresponse.ExceptionResponse;
import com.example.demo.exceptionresponse.NotIntException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler({NotIntException.class})
	public final ResponseEntity<ExceptionResponse> handleNumericException(Exception ex, WebRequest webrequest){
		ExceptionResponse er=new ExceptionResponse(new Date(),
													ex.getMessage(),
													webrequest.getDescription(false));
		return new ResponseEntity<> (er,HttpStatus.BAD_REQUEST);
	}
}
