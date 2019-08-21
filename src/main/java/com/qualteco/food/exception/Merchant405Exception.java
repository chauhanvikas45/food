package com.qualteco.food.exception;

public class Merchant405Exception extends Exception{
	private static final Integer statusCode=405;
	
	public Merchant405Exception(String msg) {
		super(msg);
	}

}
