package com.lawencon.myapp.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.lawencon.myapp.config.DbConfig;
import com.lawencon.myapp.dao.UserDao;
import com.lawencon.myapp.dao.impl.UserDaoImpl;
import com.lawencon.myapp.model.User;
import com.lawencon.myapp.service.UserService;

public class UserServiceImpl implements UserService{
	
	private final UserDao userDao;
	
	public UserServiceImpl() throws SQLException {
		final Connection conn = DbConfig.conn();
		userDao = new UserDaoImpl(conn);
	}

	@Override
	public List<User> getAll() throws SQLException {
		final List<User> users = userDao.getAll();
		return users;
	}

}
