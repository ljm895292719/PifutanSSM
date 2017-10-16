package com.pifutan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.pifutan.dao.UserDao;
import com.pifutan.entity.User;
import com.pifutan.iservice.IUserService;

@Scope("prototype")
public class TestUserService implements IUserService{
	@Autowired
	private UserDao userDao;

	@Override
	public boolean insertUser(User user) {
		return userDao.insertUser(user);
	}

	@Override
	public boolean deleteUser(User user) {
		return userDao.deleteUserById(user.getId());
	}

	@Override
	public User getUserById(String id) {
		return userDao.getUserById(id);
	}
	@Override
	public List<User> getUserByName(String name) {
		return userDao.getUserByName(name);
	}
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUser();
	}
}
