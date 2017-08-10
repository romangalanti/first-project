package com.example.demo.models;

public class Whisperer {
	
	String whisp;
	
	public Whisperer(String message) {
		whisp = message;
	}
	
	public String lower() {
		return whisp.toLowerCase();
	}
}

