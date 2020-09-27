package com.example.demo.validator;

import com.example.demo.exceptionresponse.NotIntException;

public class CalculatorValidator {

	public int getInt(String inputString) throws Exception {
		try {
			int i = Integer.parseInt(inputString);
			return i;
		} catch (Exception e) {
			throw new NotIntException("The input is not a number");
		}
	}
}
