package com.softtek.academy.end.services.user;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.repository.UserRepository;
import com.softtek.academy.end.services.UserService;
import com.softtek.academy.end.services.UserServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceImplTest {

	@InjectMocks
	UserServiceImpl userServiceImpl = new UserServiceImpl();
	
	@Mock
	UserService userService;
	
	@Mock
	UserRepository userRepo;

	@Test
	public void shouldTrueWhenUserIsFound() {
		User user = new User("admin", "admin", "Administrator");
		when(userService.user("admin")).thenReturn(user);
		assertEquals(userService.user("admin"),user);
		verify(userService).user("admin");
	}

	@Test
	public void UserServiceReadTest() {
		
	}

}
