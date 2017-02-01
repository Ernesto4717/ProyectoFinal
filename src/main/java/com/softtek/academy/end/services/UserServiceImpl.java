package com.softtek.academy.end.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> userList() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User user(String username) {
		// TODO Auto-generated method stub
		return userRepository.user(username);
	}

	@Override
	public boolean create(User user) {
		// TODO Auto-generated method stub
		if (isValidUser(user)) {
			userRepository.save(user);
			return true;
		}
		return false;
	}

	private Boolean isValidUser(final User user) {

		if (user.getName() == null || user.getName().isEmpty()) {

			return false;
		}

		if (user.getUsername() == null) {

			return false;
		}

		if (user.getPassword() == null || user.getPassword().isEmpty()) {

			return false;
		}
		return true;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		if (isValidUser(user)) {
			userRepository.updateUser(user.getPassword(), user.getName(), user.getUsername());
			return true;
		}
		return false;
	}

}
