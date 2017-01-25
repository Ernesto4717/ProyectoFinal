package com.softtek.academy.end.services;

import java.util.List;

import com.softtek.academy.end.domain.UserRole;

public interface UserRolService {
	List<UserRole> userRoleList();
	List<String> statusList();
}
