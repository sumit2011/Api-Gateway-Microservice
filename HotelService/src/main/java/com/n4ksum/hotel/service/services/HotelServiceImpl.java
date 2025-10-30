package com.n4ksum.hotel.service.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n4ksum.hotel.service.entity.Hotel;
import com.n4ksum.hotel.service.exception.HotelNotFoundException;
import com.n4ksum.hotel.service.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	private HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		String hotelId = UUID.randomUUID().toString();
		hotel.se
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
		Hotel hotel = hotelRepository.findById(id).orElseThrow(()-> new HotelNotFoundException("Hotel not found eoth id: "+ id));
		return null;
	}

}
