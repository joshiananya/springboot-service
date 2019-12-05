package com.example.demo.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RequestMapping("api/user")
@RestController
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		super();
		this.userService = userService;
		System.out.println("in");
	}
	
	@PostMapping
	public void insertUser(@RequestBody User user)
	{
		userService.insertUser(user);
		System.out.println("post");
	}
	
	@GetMapping
	public List<User> getAllUser(){
		return userService.getAllUser();
	}

}
