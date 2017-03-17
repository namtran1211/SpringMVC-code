package com.project.dao;

import com.project.model.User;

public interface UserDao {
	 User findByUserName(String userName);
	 User findByUserId(int id);
}
