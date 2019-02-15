package com.test.Assignment.service;

import java.util.List;

import com.test.Assignment.model.UserVideo;
import com.test.Assignment.repository.UserVideoRepository;

public class UserVideoService implements UserVideoServiceInt {

	private UserVideoRepository uvRepo;
	
	@Override
	public List<UserVideo> getUvList() {
		// TODO Auto-generated method stub
		return uvRepo.findAll();
	}

	public UserVideo addUv(UserVideo uv){
		
		return   uvRepo.save(uv);
	}
}
