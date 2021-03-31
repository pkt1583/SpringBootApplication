package com.springbootrest.springbootrest.controller;


import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@RequestMapping(path="/{name}",method = RequestMethod.GET)
    public String getMessage(@PathVariable(required = false) String name) {
        
        
        
        return name;
    }
	
	
	@RequestMapping(value = "/modules/**", method = RequestMethod.GET)
	@ResponseBody
	public String moduleStrings(HttpServletRequest request) {

	    String requestURL = request.getRequestURL().toString();
	    System.out.println(requestURL);

	    String moduleName = requestURL.split("/modules/")[1];
	    System.out.println(moduleName);
	    return moduleName;

	}
	@GetMapping(path = {"/user/**", "/user/{data}"})
	public String user(@PathVariable(required=false,name="data") String data,
	                 @RequestParam(required=false) Map<String,String> qparams) {
		String result="";
	    	  Iterator <Map.Entry<String, String>> itr = qparams.entrySet().iterator();
	    	  while(itr.hasNext())
	          {
	    		  System.out.print("Inside this method");
	               Map.Entry<String, String> entry = itr.next();
	             result += entry.getKey() + entry.getValue();
	          }
	    	  
	    if (data != null) {
	        System.out.println(data);
	        return data;
	    }
	    return result;
	}
	
	
	
	
}
