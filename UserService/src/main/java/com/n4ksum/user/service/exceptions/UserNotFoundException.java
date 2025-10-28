package com.n4ksum.user.service.exceptions;

public class UserNotFoundException extends RuntimeException {

	// custom constructor
	public UserNotFoundException() {
		super("User not found by the given id !!");
	}
	
	// parametrized constructor
	public UserNotFoundException(String message) {
		super(message);
	}
}
