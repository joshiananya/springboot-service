package com.example.demo.model;

import java.util.List;

import com.example.demo.model.User;

public interface UserDao {
	int insertUser(int id,User user);
	default int insertUser(User user)
	{
		int id=(int)( 10.0*Math.random());
		return insertUser(id,user);
	}
List<User>selectAllUser();
}
