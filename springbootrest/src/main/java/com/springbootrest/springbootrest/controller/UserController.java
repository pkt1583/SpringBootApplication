package com.springbootrest.springbootrest.controller;


import java.security.Principal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springbootrest.entities.Users;
import com.springbootrest.springbootrest.services.UserService;

@RestController

public class UserController {

	@Autowired
    private UserService userService;
	
	@GetMapping("/")
	public String HelloWorld() {
		return "Hello World";
	}

	
	@GetMapping("/home")
	public String restricted(Principal principal) {
		return principal.getName();
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
