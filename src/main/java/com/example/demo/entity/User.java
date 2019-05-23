package com.example.demo.entity;

import java.io.Serializable;

public class User implements Serializable {
	private Integer uId;
	private String uName;
	private String uPassword;
	private Integer uLevel;

	public User() {
	}

	public User(String uName, String uPassword) {
		this.uName = uName;
		this.uPassword = uPassword;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public Integer getuLevel() {
		return uLevel;
	}

	public void setuLevel(Integer uLevel) {
		this.uLevel = uLevel;
	}

	@Override
	public String toString() {
		return "User{" +
				"uId=" + uId +
				", uName='" + uName + '\'' +
				", uPassword='" + uPassword + '\'' +
				", uLevel=" + uLevel +
				'}';
	}
}
