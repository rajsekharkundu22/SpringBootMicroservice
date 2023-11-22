package com.example.service;

import com.example.entity.Passenger;
import com.example.entity.Ticket;

public interface TicketBookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicketDetails(Integer ticketNumber);

}
