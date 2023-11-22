package com.example.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.entity.Passenger;
import com.example.entity.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {
	
	private String BOOK_TICKET_URL = "http://127.0.0.1:8080/ticket";
	private String GET_TICKET_URL = "http://127.0.0.1:8080/ticket/{ticketNumber}";


	//Establish Communication using Rest Template 
	/*
	 * @Override public Ticket bookTicket(Passenger passenger) {
	 * 
	 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> responseEntity =
	 * rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class); Ticket ticket =
	 * responseEntity.getBody();
	 * 
	 * return ticket; }
	 */

	/*
	 * @Override public Ticket getTicket(Integer ticketNumber) {
	 * 
	 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> responseEntity =
	 * rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber); Ticket ticket =
	 * responseEntity.getBody();
	 * 
	 * return ticket; }
	 */
	
	
	//Establish Communication using WebClient
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		WebClient webClient = WebClient.create();
		
		  Ticket ticket = webClient.post()
		  .uri(BOOK_TICKET_URL)
		  .bodyValue(passenger) // convert Java object to JSON
		  .retrieve()
		  .bodyToMono(Ticket.class)
		  .block(); // .block() use to make the Communication as Sync communication
		  
		return ticket;
	}
	
	
	@Override
	public Ticket getTicket(Integer ticketNumber) {
		WebClient webClient = WebClient.create();
		
		 Ticket ticket = webClient.get()
				 				.uri(GET_TICKET_URL, ticketNumber)
				 				.retrieve()
				 				.bodyToMono(Ticket.class)
				 				.block(); // .block() use to make the Communication as Sync communication
		
		return ticket;
	}

}
