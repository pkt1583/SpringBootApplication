package com.springbootrest.springbootrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootrest.springbootrest.entities.Users;

@Service
public class UserServiceImpl implements UserService {

	List<Users> list;
	
	public UserServiceImpl() {
		list = new ArrayList<>();
		list.add(new Users(1,"Devvrat","dp","12345"));
	}
	public List<Users> getUsers() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Users addUsers(Users users) {
		list.add(users);
		System.out.println("User added");
		System.out.println(users);
		return users;
		
	}

}
