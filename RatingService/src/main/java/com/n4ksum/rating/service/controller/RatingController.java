package com.n4ksum.rating.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n4ksum.rating.service.entities.Rating;
import com.n4ksum.rating.service.service.RatingService;

@RestController
@RequestMapping("/rating-service")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;
	
	// save Rating
	@PostMapping
	public ResponseEntity<Rating> saveRating(Rating rating){
		Rating rating1 = ratingService.create(rating);
		return ResponseEntity.status(HttpStatus.CREATED).body(rating1);

	}
	
	
	// get Rating 
	@GetMapping("/{ratingId}")
	public ResponseEntity<Rating> getRating(@PathVariable String ratingId){
		Rating rating = ratingService.getRating(ratingId);
		return ResponseEntity.ok(rating);
		
	}
	
	// Get all Rating
	@GetMapping
	public ResponseEntity<List<Rating>> getAll(){
		List<Rating> allRatings = ratingService.getAll();
		return ResponseEntity.ok(allRatings);
	}
	
	// get all of user
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getRatingByUserId(@PathVariable String userId){
		List<Rating> allRatings = ratingService.getRatingByUserId(userId);
		return ResponseEntity.ok(allRatings);
	}

	// get all of hotel
	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable String hotelId){
		List<Rating> allRatings = ratingService.getRatingByHotelId(hotelId);
		return ResponseEntity.ok(allRatings);
	}
	
}
