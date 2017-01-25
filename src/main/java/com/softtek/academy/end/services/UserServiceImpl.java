package com.softtek.academy.end.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.domain.UserRole;
import com.softtek.academy.end.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> userList() {
		// TODO Auto-generated method stub
		return userRepository.userList();
	}

	@Override
	public User user(String username) {
		// TODO Auto-generated method stub
		return userRepository.user(username);
	}

	@Override
	public List<User> searchUser(String Name) {
		return userRepository.findUserByName(Name);
	}

	@Override
	public boolean update(User user, String user_role_id) {
		// TODO Auto-generated method stub

		user.setRole(new UserRole(user_role_id, ""));
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

		if (user.getStatus() == null || user.getStatus().isEmpty()) {

			return false;
		}

		if (user.getUsername() == null) {

			return false;
		}
		if (user.getRole() == null || user.getRole().getUser_roleid().isEmpty()) {
			System.out.println(4);
			return false;
		}
		System.out.println(user.getPassword());
		if (user.getPassword() == null || user.getPassword().isEmpty()) {

			return false;
		}
		return true;
	}

}
