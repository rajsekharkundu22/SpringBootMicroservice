package com.example.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.entity.Passenger;
import com.example.entity.Ticket;

@Service
public class TicketBookingServiceImpl implements TicketBookingService {
	
	private Map<Integer, Ticket> ticketData = new HashMap<>();
	private Integer ticketNum = 1;

	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setCost(500.00);
		t.setTicketStatus("CONFIRMED");
		t.setTicketNumber(ticketNum);

		ticketData.put(ticketNum, t);
		ticketNum++;
		
		return t;
	}

	@Override
	public Ticket getTicketDetails(Integer ticketNumber) {
		
		if(ticketData.containsKey(ticketNumber)){
		return ticketData.get(ticketNumber);
		}
		
		return null;
	}

}
