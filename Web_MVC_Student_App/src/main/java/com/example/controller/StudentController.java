package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.biding.StudentBinding;
import com.example.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService stuService;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		init(model);
		
		return "index";
	}
	
	
	private void init(Model model) {
		model.addAttribute("student", new StudentBinding());
		model.addAttribute("courses", stuService.getCources());
		model.addAttribute("prefTimings", stuService.getTimings());
		
	}

	@PostMapping("/save")
	public String saveStudent(StudentBinding s, Model model) {
		
		boolean isSave = stuService.saveStudentDetails(s);
		if(isSave)
		model.addAttribute("msg", "Data Save....");
		
		init(model);
		return "index";
	}
}
