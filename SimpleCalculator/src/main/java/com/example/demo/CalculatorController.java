package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.handler.SimpleCalculator;

@RestController
public class CalculatorController {

	// public Greeting greeting(@RequestParam(value="name",defaultValue="world")String name )
	
	SimpleCalculator calculator = new SimpleCalculator();

	@RequestMapping(value = "/sum/{number1}/{number2}", method = RequestMethod.GET)
	public int calculateSum(@PathVariable("number1") String number1, @PathVariable("number2") String number2)
			throws Exception {
		return calculator.getSum(number1, number2);
	}

	@RequestMapping(value = "/difference/{number1}/{number2}", method = RequestMethod.GET)
	public int calculateDiff(@PathVariable("number1") String number1, @PathVariable("number2") String number2)
			throws Exception {
		return calculator.getDifference(number1, number2);
	}

	@RequestMapping(value = "/product/{number1}/{number2}", method = RequestMethod.GET)
	public int calculateProd(@PathVariable("number1") String number1, @PathVariable("number2") String number2)
			throws Exception {
		return calculator.getProduct(number1, number2);
	}

	@RequestMapping(value = "/division/{number1}/{number2}", method = RequestMethod.GET)
	public int calculateDiv(@PathVariable("number1") String number1, @PathVariable("number2") String number2)
			throws Exception {
		return calculator.getQuotient(number1, number2);
	}

}
