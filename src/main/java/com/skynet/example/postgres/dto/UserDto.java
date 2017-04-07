package com.skynet.example.postgres.dto;

import com.skynet.example.postgres.domain.User;

public class UserDto {
	
	private Long id;
	
	private String username;

	private String password;
	
	public UserDto() {		
	}

	public UserDto(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.password = user.getPassword();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
