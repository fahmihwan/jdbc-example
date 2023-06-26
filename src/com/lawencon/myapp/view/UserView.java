package com.lawencon.myapp.view;

import java.util.List;

import com.lawencon.myapp.model.User;
import com.lawencon.myapp.service.UserService;
import com.lawencon.myapp.service.impl.UserServiceImpl;

public class UserView {
	
	private final UserService userService;
	
	public UserView() throws Exception{
		this.userService = new UserServiceImpl();
	}

	public void show() throws Exception {
		final List<User> users = userService.getAll();
		users.forEach(u -> {
			System.out.println("ID : "+u.getId());
			System.out.println("Username : "+u.getUserEmail());
			System.out.println("Password : "+u.getUserPassword());
		});
	}
}
