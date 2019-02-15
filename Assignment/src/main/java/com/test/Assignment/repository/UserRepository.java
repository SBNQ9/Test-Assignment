package com.test.Assignment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.test.Assignment.model.User;

public interface UserRepository extends CrudRepository<User, String> {

	public List<User> findAll();
}
