package com.spring.aop.example.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class User {

	@Value(value = "Sajjad")
	private String username;
	@Value(value = "navabsajjad.ali@gmail.com")
	private String email;
	@Value(value = "7013806228")
	private long mobile;
	private int user_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	
	public void saveUser() {

		System.out.println("=======================");

		System.out.println(username + "Saved Successfully");
		System.out.println("User details:");
		System.out.println("username" + username);
		System.out.println("Mobile number:" + mobile);
		System.out.println("Email Id:" + email);

		System.out.println("=======================");

	}

}
