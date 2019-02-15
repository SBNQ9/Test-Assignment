package com.test.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.Assignment.model.Video;
import com.test.Assignment.repository.VideoRepository;

public class VideoService implements VideoServiceInt {

	@Autowired
	private VideoRepository videoRepo;
	
	@Override
	public List<Video> getVideos() {
		return videoRepo.findAll();
	}

}
