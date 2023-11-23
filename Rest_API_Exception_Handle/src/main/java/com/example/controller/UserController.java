package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.UserNotFoundException;

@RestController
public class UserController {
	
	@GetMapping("/user/{userId}")
	public String getUserDetails(@PathVariable("userId") Integer userId) throws Exception {
		
			if(userId == 100) return "Jhon";
			else if(userId == 200) return "Smith";
			else throw new UserNotFoundException("User Not Found");
			
			
	}

}
