package com.lawencon.myapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lawencon.myapp.dao.UserDao;
import com.lawencon.myapp.model.User;

public class UserDaoImpl implements UserDao{
	
	private final Connection conn;
	
	public UserDaoImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public List<User> getAll() throws SQLException {
		final String sql = "SELECT * FROM t_user";
		final PreparedStatement ps = conn.prepareStatement(sql);
		final ResultSet rs = ps.executeQuery();
		
		final List<User> users = new ArrayList<>();
		while(rs.next()) {
			final User user = new User();
			user.setId(rs.getLong("id"));
			user.setUserEmail(rs.getString("user_email"));
			user.setUserPassword(rs.getString("user_password"));
			users.add(user);
		}
		
		return users;
	}

}
