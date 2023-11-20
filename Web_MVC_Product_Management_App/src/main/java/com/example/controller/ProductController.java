package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.Product;
import com.example.repository.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepository pRepo;
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("p", new Product());
		
		return "index";
	}
	
	@PostMapping("/product")
	public String handleSave(@ModelAttribute("p") Product p, Model model) {
		
		p = pRepo.save(p);
		if(p.getPId() != null) {
			model.addAttribute("msg", "Product added successfully");
		}
		/*
		 * To display same index page again we can do it 2 ways
		 1st way: model.addAttribute("p", new Product());
		 2nd way: Add @ModelAttribute("p") Product p in method parameter
		 */
		
		return "index";
	}
	
	@GetMapping("/products")
	public String loadProduct(Model model) {
		
		model.addAttribute("products", pRepo.findAll());
		
		return "data";
	}
	
	

}
