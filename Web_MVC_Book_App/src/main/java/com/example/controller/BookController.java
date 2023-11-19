package com.example.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Book;
import com.example.repository.BookRepository;

@Controller
public class BookController {

	private BookRepository bookRepo;

	@Autowired
	private BookController(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	// 1st approach  to create controller method
	
	/*
	 * @GetMapping("/book") public ModelAndView getBookById(@RequestParam("id")
	 * Integer id) { ModelAndView mav = new ModelAndView();
	 * 
	 * Optional<Book> findById = bookRepo.findById(id);
	 * 
	 * if (findById.isPresent()) { Book book = findById.get(); mav.addObject("book",
	 * book); } mav.setViewName("index");
	 * 
	 * return mav;
	 * 
	 * }
	 */
	
	
	// 2nd Approach to create controller method without using ModelAndView class. Here we use Model interface. Most of the people use this approach
	
	@GetMapping("/book")
	public String getBookById(@RequestParam("id") Integer id, Model model) {

		Optional<Book> findById = bookRepo.findById(id);

		if (findById.isPresent()) {
			Book book = findById.get();
			model.addAttribute("book", book);
		}

		return "index";

	}

}
