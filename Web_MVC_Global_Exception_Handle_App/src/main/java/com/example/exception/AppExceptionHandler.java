package com.example.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	private Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);
	
	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception e) {
		String msg = e.getMessage();
		logger.error(msg);
		return "Some Problem Occurred, Please try after some time";
	}

}
