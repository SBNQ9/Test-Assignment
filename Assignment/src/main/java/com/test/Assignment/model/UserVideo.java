package com.test.Assignment.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="UserVideo")
public class UserVideo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Column(name="userId")
    private int userId;  

	@Column(name="videoId")
    private int videoId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public UserVideo(int userId, int videoId) {
		super();
		this.userId = userId;
		this.videoId = videoId;
	}

	public UserVideo() {
super();
}
}
