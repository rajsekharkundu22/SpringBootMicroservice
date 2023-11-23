package com.example.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
	
	//This is generic method to handle all type of exception
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ErrorInfo> handleException(Exception e){
		String exMsg = e.getMessage();
		
		ErrorInfo info = new ErrorInfo();
		info.setCode("MMTEX0003");
		info.setMsg(exMsg);
		info.setDate(LocalDateTime.now());
		
		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//User Define exception
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<ErrorInfo> UserNotFoundException(Exception e){
		String exMsg = e.getMessage();
		
		ErrorInfo info = new ErrorInfo();
		info.setCode("MMTEX0001");
		info.setMsg(exMsg);
		info.setDate(LocalDateTime.now());
		
		return new ResponseEntity<>(info, HttpStatus.BAD_REQUEST);
	}

}
