package com.n4ksum.hotel.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.n4ksum.hotel.service.entity.Hotel;
import com.n4ksum.hotel.service.repository.HotelRepository;

public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepository.save(hotel);
	}


	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		List<Hotel> allHotels = hotelRepository.findAll();
		return null;
	}

	@Override
	public Hotel getHotel(String id) {
		// TODO Auto-generated method stub
		Hotel hotel = hotelRepository.getById(id);
		return null;
	}

}
