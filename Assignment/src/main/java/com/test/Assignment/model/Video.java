package com.test.Assignment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="UserVideo")
public class Video implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 3731736773904674771L;

	@Id
	@Column(name="videoId")
    private int videoId;
    
    @Column(name="videoName")
    private String videoName;
    
    @Column(name="videoGroup")
    private String videoGrp;
    
    @Column(name="Active_ind")
    private Character active;

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public String getVideoName() {
		return videoName;
	}

	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}

	public String getVideoGrp() {
		return videoGrp;
	}

	public void setVideoGrp(String videoGrp) {
		this.videoGrp = videoGrp;
	}

	public Character getActive() {
		return active;
	}

	public void setActive(Character active) {
		this.active = active;
	}

	public Video(int videoId, String videoName, String videoGrp, Character active) {
		super();
		this.videoId = videoId;
		this.videoName = videoName;
		this.videoGrp = videoGrp;
		this.active = active;
	}
    
}
