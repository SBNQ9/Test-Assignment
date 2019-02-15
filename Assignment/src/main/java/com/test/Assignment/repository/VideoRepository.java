package com.test.Assignment.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.test.Assignment.model.Video;

public interface VideoRepository extends CrudRepository<Video, String> {

	List<Video> findAll();
}
