package com.example.service;

import com.example.entity.Passenger;
import com.example.entity.Ticket;

public interface MakeMyTripService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}
