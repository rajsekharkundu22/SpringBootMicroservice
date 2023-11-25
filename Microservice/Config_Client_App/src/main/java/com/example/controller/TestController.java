package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${msg}")
	private String msg;
	
	@GetMapping
	public String greetMsg() {
		
		return msg;
	}

}
