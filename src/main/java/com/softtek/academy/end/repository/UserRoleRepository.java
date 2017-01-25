package com.softtek.academy.end.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softtek.academy.end.domain.UserRole;


@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long>{
	


}
