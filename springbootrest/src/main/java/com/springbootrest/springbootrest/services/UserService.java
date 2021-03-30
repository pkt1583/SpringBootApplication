package com.springbootrest.springbootrest.services;

import java.util.List;

import com.springbootrest.springbootrest.entities.Users;

public interface UserService {
     public List<Users> getUsers();
     
     public Users addUsers(Users users);
}

