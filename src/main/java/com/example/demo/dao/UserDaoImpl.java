package com.example.demo.dao;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
import com.example.demo.model.UserDao;

	@Repository
	public class UserDaoImpl implements UserDao {
	public static List<User> DB = new ArrayList<>();
	public int insertUser(int id,User user)
	{
	
		System.out.println("dao");
		DB.add(new User(id,user.getName()));
		return 1;
	}
	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return DB;
	}
}
