package com.softtek.academy.end.services;

import java.util.List;

import com.softtek.academy.end.domain.User;

public interface UserService {
	
	public List<User> userList();
	public User user(String username);
	public List<User> searchUser(String username);
	public boolean save(User user);

}
