package com.lawencon.myapp.service;

import java.sql.SQLException;
import java.util.List;

import com.lawencon.myapp.model.User;

public interface UserService {
	List<User> getAll() throws SQLException;
}
