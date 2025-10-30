package com.n4ksum.rating.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.n4ksum.rating.service.entities.Rating;
import com.n4ksum.rating.service.exceptions.RatingNotFoundException;
import com.n4ksum.rating.service.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService{
	
	
	
	@Autowired
	private RatingRepository ratingRepo;
	

	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		return ratingRepo.save(rating) ;
	}

	@Override
	public Rating getRating(String ratingId) {
		// TODO Auto-generated method stub
		Rating rating = ratingRepo.findById(ratingId).orElseThrow(()-> new RatingNotFoundException("Rating Not Found with id: "+ ratingId));
		return rating;
	}

	@Override
	public List<Rating> getAll() {
		// TODO Auto-generated method stub
		List<Rating> allRating = ratingRepo.findAll();
		return allRating;
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		// TODO Auto-generated method stub
		return ratingRepo.fingByuserId(userId);
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		// TODO Auto-generated method stub
		return ratingRepo.findByHotelId(hotelId);
	}

	
}
