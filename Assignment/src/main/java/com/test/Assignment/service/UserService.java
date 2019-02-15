package com.test.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.Assignment.model.User;
import com.test.Assignment.repository.UserRepository;

public class UserService implements UserServiceInt {
	
	@Autowired
    private UserRepository userRepo;
	
	@Override
	public List<User> getUsersList() {
	
		return userRepo.findAll();
	}

}
