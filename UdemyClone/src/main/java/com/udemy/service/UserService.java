package com.udemy.service;

import org.springframework.stereotype.Service;

import com.udemy.dao.UserDao;
import com.udemy.model.User;

@Service
public class UserService {
	private UserDao userDao;
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}
}
