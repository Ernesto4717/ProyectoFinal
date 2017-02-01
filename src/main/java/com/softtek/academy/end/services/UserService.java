package com.softtek.academy.end.services;

import java.util.List;

import com.softtek.academy.end.domain.User;

public interface UserService {
	
	public List<User> userList();
	public User user(String username);
	public boolean create(User user);
	public boolean update(User user);

}
