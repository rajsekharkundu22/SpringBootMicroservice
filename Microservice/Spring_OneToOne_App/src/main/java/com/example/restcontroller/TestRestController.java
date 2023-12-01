package com.example.restcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Laptop;
import com.example.entities.Student;
import com.example.repositories.LaptopRepository;
import com.example.repositories.StudentRepository;
import com.example.service.LaptopService;

@RestController
public class TestRestController {
	
	
	@Autowired
    private LaptopService laptopService;
	
	@Autowired
    private LaptopRepository laptopRepository;
	
	@Autowired
    private StudentRepository studentRepository;

    
    @PostMapping("/saveLaptop")
    public ResponseEntity<Integer> saveLaptop(@RequestBody Laptop laptop) {
    	int laptopId = laptopService.saveLaptop(laptop);
        return ResponseEntity.ok(laptopId);
    }
    
    
    @GetMapping("/laptop")
    public Optional<Laptop> getLaptop(@RequestParam("sId") int sId) {
    	return Optional.of(laptopRepository.findById(sId).orElse(null));
        
    }
    
    @GetMapping("/student")
    public Optional<Student> getStudent(@RequestParam("sId") int sId) {
    	return Optional.of(studentRepository.findById(sId).orElse(null));
        
    }
	

}
