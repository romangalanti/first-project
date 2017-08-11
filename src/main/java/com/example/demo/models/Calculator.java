package com.example.demo.models;

public class Calculator {
	
	double secret1;
	double secret2;
	
	public Calculator(double first, double second) {
		secret1 = first;
		secret2 = second;
	}
	
	public double doTheAdd() {
		return secret1 + secret2;
	}
	
	public double doTheSubtract() {
		return secret1 - secret2;
	}
	
	public double doTheMultiply() {
		return secret1 * secret2;
	}
	
	public double doTheDivision() {
		return secret1 / secret2;
	}
	
	public double doTheModulo() {
		return secret1 % secret2;
	}
	
	public double doTheExponent() {
		return Math.pow(secret1, secret2);
	}
	
}
