package com.example.demo.handler;

import com.example.demo.validator.CalculatorValidator;

public class SimpleCalculator {

	CalculatorValidator validator=new CalculatorValidator();
	public int getSum(String numOne, String numTwo) throws Exception{
		return validator.getInt(numOne) + validator.getInt(numTwo);
	}

	public int getDifference(String numOne, String numTwo)throws Exception{
		return validator.getInt(numOne) - validator.getInt(numTwo);
	}

	public int getProduct(String numOne, String numTwo)throws Exception{
		return validator.getInt(numOne) * validator.getInt(numTwo);
	}

	public int getQuotient(String numOne, String numTwo) throws Exception{
		return validator.getInt(numOne) / validator.getInt(numTwo);
	}
}
