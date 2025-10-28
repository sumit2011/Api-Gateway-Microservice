package com.n4ksum.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.n4ksum.user.service.entity.User;

public interface UserRepository extends JpaRepository<User, String>{

}
