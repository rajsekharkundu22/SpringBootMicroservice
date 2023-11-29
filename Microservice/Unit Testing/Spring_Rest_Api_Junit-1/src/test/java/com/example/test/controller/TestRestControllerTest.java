package com.example.test.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.Rest.TestRestController;
import com.example.service.TestService;

@WebMvcTest(value = TestRestController.class)
public class TestRestControllerTest {

	@MockBean
	private TestService testService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testWelcome() throws Exception {
		
		when(testService.getWelcomeMsg()).thenReturn("Welcome to IT world");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/welcome");
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
	}
	
	@Test
	public void testGreet() throws Exception {
		
		when(testService.getGreetMsg()).thenReturn("Good Morning all....");
		
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/greet");
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		MockHttpServletResponse response = result.getResponse();
		
		int status = response.getStatus();
		
		assertEquals(200, status);
	}
	
}
