package com.n4ksum.hotel.service.services;

import java.util.List;

import com.n4ksum.hotel.service.entity.Hotel;

public interface HotelService {

	//create
	Hotel create(Hotel hotel);
	
	// getall
	List<Hotel> getAllHotel();
	
	//get single hotel by id 
	Hotel getHotel(String id);
}
