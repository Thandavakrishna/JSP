package com.thandav.learn.service;

import java.util.HashMap;

import com.thandav.learn.dto.User;

public class LoginService {
	
	HashMap<String, String> users= new HashMap<String, String>();
	
	public LoginService() {

		users.put("tkrish", "Thandava Krishna");
		users.put("koundi", "Koundinya");
		users.put("ma", "Mother");
	}

		public boolean authenticate(String userId, String password){
			
			if( password == null || password.trim() == "") {
				return false;
			}
			return true;
		}
		
		public User getUserDetails(String userId){
			User user = new User();
			user.setUserName(users.get(userId));
			user.setUserId(userId);
			return user;			
		}
}
