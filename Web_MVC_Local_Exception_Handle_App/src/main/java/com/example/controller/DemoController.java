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
	
	//Local exception handling
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		String msg = e.getMessage();
		logger.error(msg);
		return "Some Problem Occurred, Please try after some time";
	}

}
