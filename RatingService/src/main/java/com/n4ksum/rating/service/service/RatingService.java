package com.n4ksum.rating.service.service;

import java.util.List;

import com.n4ksum.rating.service.entities.Rating;

public interface RatingService {

	// save rating
	Rating create(Rating rating);
	
	// get rating
	Rating getRating(String ratingId);
	
	
	// get all rating
	List<Rating> getAll();
	
	// get all by userid
	List<Rating> getRatingByUserId(String userId);
	
	// get all by hotelid
	List<Rating> getRatingByHotelId(String hotelId);
}
