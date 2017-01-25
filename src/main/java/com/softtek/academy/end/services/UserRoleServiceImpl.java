package com.softtek.academy.end.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.academy.end.domain.UserRole;
import com.softtek.academy.end.repository.UserRoleRepository;

@Service
public class UserRoleServiceImpl  implements UserRolService{

	@Autowired
	UserRoleRepository userRoleRepository;
	
	@Override
	public List<UserRole> userRoleList() {
		// TODO Auto-generated method stub
		return userRoleRepository.findAll();
	}

	@Override
	public List<String> statusList() {
		List<String>status=new ArrayList<String>();
		status.add("S");
		status.add("N");
		return status;
	}

	
}
