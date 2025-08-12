package com.deepak.eventHandler;

public class UserRegisteredEvent {
	private String username;
	private String email;

	public UserRegisteredEvent(String username, String email) {
		this.username = username;
		this.email = email;
	}

}
