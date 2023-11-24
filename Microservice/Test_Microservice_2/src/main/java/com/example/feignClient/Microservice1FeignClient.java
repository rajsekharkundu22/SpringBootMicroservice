package com.example.feignClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Microservice-1")
public interface Microservice1FeignClient {
	
	
	
	@GetMapping("/greet")
	public String invokeGetGreetMsg();

}
