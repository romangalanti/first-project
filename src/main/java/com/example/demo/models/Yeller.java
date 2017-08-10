package com.example.demo.models;

public class Yeller {
	
	String yell2;
	
	public Yeller(String message) {
		yell2 = message;
	}
	
	public String caps() {
		return yell2.toUpperCase();
		
	}

}
