package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/")
	public String getMsg() {
		
		// Exception occurre here
		int i=10/0;
		return "Good Evening";
	}
	
	

}
