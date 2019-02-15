package com.test.Assignment.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 


@Entity
@Table(name="User")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="userId")
	private int userId; 
	
	@Column(name="userName")
    private String userName;
    
    @Column(name="userGroup")
    private String userGrp;
    
    @Column(name="Active_ind")
    private Character active;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserGrp() {
		return userGrp;
	}

	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}

	public Character getActive() {
		return active;
	}

	public void setActive(Character active) {
		this.active = active;
	}

	public User(int userId, String userName, String userGrp, Character active) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userGrp = userGrp;
		this.active = active;
	}

}
