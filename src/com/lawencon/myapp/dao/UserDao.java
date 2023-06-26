package com.lawencon.myapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.lawencon.myapp.model.User;

public interface UserDao {
	List<User> getAll() throws SQLException;
}
