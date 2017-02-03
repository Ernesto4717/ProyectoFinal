package com.softtek.academy.end.services.user;

import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.services.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/User-Context.xml")
@DatabaseSetup(value = { "/dataset/user/default.xml" }, type = DatabaseOperation.CLEAN_INSERT)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class, DbUnitTestExecutionListener.class })
public class UserServiceImplIT {
	
	@Autowired
	UserService userService;
	
	@Test
	@ExpectedDatabase("/dataset/user/expected.xml")
	public void UserServiceCreateTest(){
		User user = new User("test","test","userForTest");
		userService.create(user);
	}
	
	@Test
	public void UserServiceReadTest(){
		List<User> users = userService.userList();
		Assert.assertTrue(!users.isEmpty());
	}
	
	@Test
	@Ignore
	@ExpectedDatabase("/dataset/user/updateExpected.xml")
	public void shouldTrueWhenUpdateIsCorrect(){
		User user = new User("admin", "admina", "Administrator2");
		userService.update(user);
	}

}
