package com.example.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.TestService;

@RestController
public class TestRestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping("/welcome")
	public ResponseEntity<String> welcome(){
		String welcomeMsg = testService.getWelcomeMsg();
		
		return new ResponseEntity<>(welcomeMsg, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public ResponseEntity<String> greet(){
		String greetMsg = testService.getGreetMsg();
		
		return new ResponseEntity<>(greetMsg, HttpStatus.OK);
	}
}
