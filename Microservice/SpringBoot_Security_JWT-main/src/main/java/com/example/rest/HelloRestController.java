package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

	

}
