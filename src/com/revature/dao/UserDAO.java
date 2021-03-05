package com.revature.dao;

import java.awt.List;

import com.revature.pojo.User;

public interface UserDAO {
	
	public void createUser(User user);
	public User getUserByUsername(String username);
	public List<User> getAllUsers();	
	public void removeUser(User user);
}
