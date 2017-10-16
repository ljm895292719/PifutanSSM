package com.pifutan.iservice;

import java.util.List;

import com.pifutan.entity.User;


public interface IUserService {
	public boolean insertUser(User user);
	public boolean deleteUser(User user);
	public List<User> getAllUsers();
	public User getUserById(String id);
	public List<User> getUserByName(String name);

}
