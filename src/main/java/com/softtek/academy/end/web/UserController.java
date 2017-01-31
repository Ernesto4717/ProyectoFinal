package com.softtek.academy.end.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.softtek.academy.end.domain.User;
import com.softtek.academy.end.services.UserService;

/**
 * Handles requests for the application home page.
 */
@RequestMapping(value = "/User")
@Controller
public class UserController {

	static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String root() {
		return "home";
	}

	@RequestMapping(value = "/List")
	public String List(Model model) {
		return "users";
	}

	@RequestMapping(value = "/ListData", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllEmployeesJSON() {
		List<User> users = userService.userList();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}

	@RequestMapping(value = "/Lists")
	@ResponseBody
	public ResponseEntity<?> searchUser(@RequestParam final String user) {
		System.out.println(user);
		List<User> users = userService.searchUser(user);
		System.out.println(users);
		if (users.size() > 1) {
			return new ResponseEntity<List<User>>(users, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<User>>(users, HttpStatus.CONFLICT);
		}
	}

	@RequestMapping(value = "/edit")
	public String editUser(@RequestParam String username, Model model) {
		User user = userService.user(username);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("users", user);
		model.addAttribute("map", map);
		return "editUser";

	}

	@RequestMapping(value = "/create")
	public ModelAndView create(@RequestParam String status) {

		/*
		 * List<UserRole> userRoleList = userRoleService.list(); List<String>
		 * listStatus = userService.statusList(); Map<String,Object>map=new
		 * HashMap<String, Object>(); map.put("userRole", userRoleList);
		 * map.put("listStatus", listStatus); map.put("status", status); return
		 * new ModelAndView("jsp/"+"User"+"/create","map",map);
		 */
		return null;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser(@ModelAttribute User user, HttpServletRequest request) {

		if (userService.save(user)) {
			return "redirect:/User/List";
		}
		return "redirect:/User/edit?username=" + user.getUsername() + "&status=Not valid";

	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@ModelAttribute User user) {
		if (userService.save(user)) {
			return "redirect:/User/List";
		}
		return "redirect:/User/create?status=Not Valid";
	}
}
