package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Passenger;
import com.example.entity.Ticket;
import com.example.service.TicketBookingService;

@RestController
public class TicketBookController {
	
	@Autowired
	private TicketBookingService ticketBookService;
	
	@PostMapping("/ticket")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger passenger){
		
		Ticket bookTicket = ticketBookService.bookTicket(passenger);
		
		return new ResponseEntity<>(bookTicket, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/ticket/{ticketNumber}")
	public ResponseEntity getTicketDetails(@PathVariable("ticketNumber") Integer ticketNumber){

		Ticket ticketDetails = ticketBookService.getTicketDetails(ticketNumber);

		return new ResponseEntity(ticketDetails, HttpStatus.OK);

	}

}
