package com.springbootrest.springbootrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springbootrest.entities.Users;
import com.springbootrest.springbootrest.services.UserService;

@RestController

public class UserController {

	@Autowired
    private UserService userService;
	
//	@GetMapping("/helloworld")
//	public String HelloWorld() {
//		return "Hello World";
//	}
//	
//	@GetMapping("/allusers")
//	public List<Users>getUsers(){
//		return this.userService.getUsers();
//	}
//	@GetMapping("/register")
//	public String showForm(Model model){
//		Users users = new Users();
//		model.addAttribute("user",users);
//		return "register_form";
//	}
//	@RequestMapping(value="/register",method =RequestMethod.POST)
//	public String doRegistration(@ModelAttribute("user")Users users){
//	System.out.println(users);
//	
//
//	return "register_success";
//}
//	
	@RequestMapping(path="/{name}")
    public String getMessage(@PathVariable("name") String name) {
        
        var msg = name;
        System.out.println(msg);
        return msg;
    }
	
	
	
	
}
