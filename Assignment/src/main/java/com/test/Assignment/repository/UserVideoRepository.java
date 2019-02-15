package com.test.Assignment.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.test.Assignment.model.UserVideo;

public interface UserVideoRepository extends CrudRepository<UserVideo, String> {

	List<UserVideo> findAll();
	
	UserVideo save(UserVideo u);
}
