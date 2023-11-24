package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignClient.Microservice1FeignClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private Microservice1FeignClient microservice1FeignClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String msg = microservice1FeignClient.invokeGetGreetMsg();
		
		return msg + ", Welcome to microservice world";
	}
	
	
}
