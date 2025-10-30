package com.n4ksum.rating.service.exceptions;

public class RatingNotFoundException extends RuntimeException {

	public RatingNotFoundException() {
		super("Rating Not Found !!");
	}
	
	public RatingNotFoundException(String message) {
		super(message);
	}
}
