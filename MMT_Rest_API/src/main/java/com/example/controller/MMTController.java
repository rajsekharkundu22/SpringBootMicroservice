package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Passenger;
import com.example.entity.Ticket;
import com.example.service.MakeMyTripService;

@Controller
public class MMTController {
	
	@Autowired
	private MakeMyTripService service;
	
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute("passenger") Passenger passenger, Model model) {
		
		Ticket ticket = service.bookTicket(passenger);
		
		model.addAttribute("passenger", new Passenger());
		model.addAttribute("bookingResponse", "Your ticket book successfully. " +"Ticket Number : "+ticket.getTicketNumber());
		
		return "index";
	}
	
	@GetMapping("/ticket")
	public String getTicketForm(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "ticket-form";
	}
	
	@GetMapping("/get-ticket")
	public String getTicket(@RequestParam("ticketNumber") Integer ticketNumber,Model model) {
		
		Ticket ticket = service.getTicket(ticketNumber);
		model.addAttribute("ticket", ticket);
		return "ticket-form";
	}

}
