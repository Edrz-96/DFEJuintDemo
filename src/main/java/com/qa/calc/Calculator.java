package com.qa.calc;

public class Calculator {

	private double num1;

	public Calculator() {

	}

	public Calculator(double num1) {
		this.num1 = num1;
	}

	public double addition(double a, double b) {
		return a + b;
	}

	public double subtraction(double a, double b) {
		return a - b;

	}

	public double div(double a, double b) throws ArithmeticException {

		if (b == 0) {
			throw new ArithmeticException("Can't divide by 0!");
		} else {

			return a / b;
		}
	}

	public double mult(double a, double b) {
		return a * b;

	}

}
