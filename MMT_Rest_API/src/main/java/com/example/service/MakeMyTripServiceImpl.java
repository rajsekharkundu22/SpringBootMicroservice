package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.entity.Passenger;
import com.example.entity.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {
	
	private String BOOK_TICKET_URL = "http://127.0.0.1:8080/ticket";
	private String GET_TICKET_URL = "http://127.0.0.1:8080/ticket/{ticketNumber}";

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> responseEntity = rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
		Ticket ticket = responseEntity.getBody();
		
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {

		RestTemplate rt = new RestTemplate();
		 ResponseEntity<Ticket> responseEntity = rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber);
		 Ticket ticket = responseEntity.getBody();
		 
		return ticket;
	}

}
