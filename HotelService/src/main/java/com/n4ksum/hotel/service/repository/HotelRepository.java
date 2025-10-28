package com.n4ksum.hotel.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.n4ksum.hotel.service.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
