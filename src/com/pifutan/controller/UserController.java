package com.pifutan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pifutan.entity.User;
import com.pifutan.service.TestUserService;
import com.pifutan.service.UserService;

@Controller
@Scope("prototype")
@ResponseBody() // 返回json，@ResponseEntity类似
public class UserController extends BaseController{
	@Autowired
	private UserService userService;
	@Autowired
	private TestUserService testUserService;
	@RequestMapping("/getAllUser")
	public Result getAllUser() {
		errorMessage = "getAllUser";
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return result(userService.getAllUsers());
	}
	@RequestMapping("/getAllUser2")
	public Result getAllUser2() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return result(testUserService.getAllUsers());
	}
	@RequestMapping("/getUserById")
	public User getUserById(String id) {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return userService.getUserById(id);
	}
	@RequestMapping("/getUserByName")
	public List<User> getUserByName(String name) {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return userService.getUserByName(name);
	}

}
