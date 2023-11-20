package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/greet")
	public String getGreet() {
		
		// Exception occurre here
		String st = null;
		st.length();
		
		
		return "Good Evening";
	}

}
