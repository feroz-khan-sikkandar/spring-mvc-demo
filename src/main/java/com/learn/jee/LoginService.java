package com.learn.jee;

public class LoginService {
	public boolean validateUser(String user, String password) {
		return user.equals("feroz") && password.equals("test");
	}
}
