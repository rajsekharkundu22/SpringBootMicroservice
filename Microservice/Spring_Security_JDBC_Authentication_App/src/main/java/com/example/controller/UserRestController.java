package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
	
	//Only Admin can access
	@GetMapping("/admin")
	public String admin() {
		return "Welcome To Admin Panel";
	}
	
	//Only Admin and User can access
	@GetMapping("/user")
	public String user() {
		return "Welcome To User Panel";
	}
	
	//Anyone canaccess
	@GetMapping("/about")
	public String getAboutUs() {
		return "Welcome To About us Page";
	}

}
