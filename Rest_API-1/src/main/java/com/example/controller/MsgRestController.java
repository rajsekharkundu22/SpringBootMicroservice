package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@PostMapping
	public ResponseEntity<String> saveMsg() {
		
		String responseBody = "Msg Save Successfully";
		
		return new ResponseEntity<String>(responseBody, HttpStatus.CREATED);
	}
	
	
	@GetMapping
	public ResponseEntity<String> getWelcomeMsg() {
		String msg = "Welcome to Rest API..!!";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
