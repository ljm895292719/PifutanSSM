package com.pifutan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.pifutan.entity.User;
import com.pifutan.ientity.IUser;
import com.pifutan.iservice.IUserService;

@Scope("prototype")
public class UserService implements IUserService{
	@Autowired
	private IUser iUser;

	@Override
	public boolean insertUser(User user) {
		return iUser.insertUser(user);
	}

	@Override
	public boolean deleteUser(User user) {
		return iUser.deleteUserById(user.getId());
	}

	@Override
	public User getUserById(String id) {
		return iUser.getUserById(id);
	}
	@Override
	public List<User> getUserByName(String name) {
		return iUser.getUserByName(name);
	}
	@Override
	public List<User> getAllUsers() {
		return iUser.getAllUser();
	}
}
