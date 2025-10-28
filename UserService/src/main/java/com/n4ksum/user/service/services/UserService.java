package com.n4ksum.user.service.services;

import java.util.List;

import com.n4ksum.user.service.entity.User;

public interface UserService {

	// user operations
	
	//create
	User saveUser(User user);
	
	// get all user
	List<User> getAllUser();
	
	//get user by userid
	User getUser(String userId);
	
	// TODO: delete user by userid
	
	// TODO: update user
	// User updateUser(User user);
}
