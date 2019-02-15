package com.test.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.Assignment.model.User;
import com.test.Assignment.model.UserVideo;
import com.test.Assignment.model.Video;
import com.test.Assignment.service.UserService;
import com.test.Assignment.service.UserVideoService;
import com.test.Assignment.service.VideoService;

@RestController
@RequestMapping("assignment")
public class UserVideoTestController {

	@Autowired
	UserService userSrvc;
	
	@Autowired
	VideoService videoSrvc;
	
	@Autowired
	UserVideoService ucSrvc;
	
	
	@GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
	return new ResponseEntity<List<User>>(userSrvc.getUsersList(), HttpStatus.OK);
    }
	
	@GetMapping("/videos")
    public ResponseEntity<List<Video>> getVideos() {
	return new ResponseEntity<List<Video>>(videoSrvc.getVideos(), HttpStatus.OK);
    }
	
	@PostMapping("/saveUserVideos")
    public ResponseEntity<UserVideo> addUserVideos(@RequestParam(value="user", required=true) int users,
    		@RequestParam(value="video", required=true) int videos) {
		UserVideo uv=new UserVideo();
		uv.setUserId(users);
		uv.setVideoId(videos);
		
		
	return new ResponseEntity<UserVideo>(ucSrvc.addUv(uv), HttpStatus.OK);
    }
	
}
