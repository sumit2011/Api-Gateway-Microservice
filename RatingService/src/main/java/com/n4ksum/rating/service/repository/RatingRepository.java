package com.n4ksum.rating.service.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.n4ksum.rating.service.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating,String>  {

	List<Rating> fingByuserId(String userId);
	List<Rating> findByHotelId(String hotelId);
}
