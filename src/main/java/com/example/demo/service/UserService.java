package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserDao;
import com.example.demo.model.User;
@Service
public class UserService {

	
	private UserDao userDao;

	@Autowired
	public UserService(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	public int insertUser(User user)
	{

		System.out.println("service");
		return userDao.insertUser(user);

	}
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.selectAllUser();
	}
}
