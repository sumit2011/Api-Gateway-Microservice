package com.n4ksum.hotel.service.exception;

public class HotelNotFoundException extends RuntimeException{
	
	public HotelNotFoundException(String message) {
		super(message);
	}
	
	public HotelNotFoundException() {
		super("Hotel Not found!!");
	}

}
