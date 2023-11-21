package com.example.controller;

import java.util.HashMap;
import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;

@RestController
public class UserRestController {
	
	
	private Map<Integer, User> dataMap = new HashMap<>();
	
	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		System.out.println(user);
		
		dataMap.put(user.getId(), user);
		
		return new ResponseEntity<String>("User Saved",HttpStatus.CREATED);
	}
	
	//Query Param example
	@GetMapping("/user")
	public User getUser(@RequestParam("userId") Integer userId) {
		
		User user = new User();;
		
		if(dataMap.containsKey(userId)) {
			user = dataMap.get(userId);
		}
		return user;
	}
	
	//Path Param example
	@GetMapping("/user/{userId}")
	public User getUser1(@PathVariable("userId") Integer userId) {
		User user = new User();;
		
		if(dataMap.containsKey(userId)) {
			user = dataMap.get(userId);
		}
		return user;
	}

}
