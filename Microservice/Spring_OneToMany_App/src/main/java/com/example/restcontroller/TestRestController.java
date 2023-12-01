package com.example.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Classes;
import com.example.entities.Teacher;
import com.example.repositories.ClassesRepository;
import com.example.repositories.TeacherRepository;
import com.example.service.ClassesService;
import com.example.service.TeacherService;

@RestController
public class TestRestController {
	
	
	@Autowired
    private ClassesService classesService;
	
	@Autowired
    private TeacherService teacherService;
	
	@Autowired
    private ClassesRepository classesRepository;
	
	@Autowired
    private TeacherRepository teacherRepository;

    
//    @PostMapping("/saveLaptop")
//    public ResponseEntity<String> saveLaptop(@RequestBody List<Classes> classes) {
//    	classesService.saveClasses(classes);
//        return ResponseEntity.ok("Data Save");
//    }
	
	@PostMapping("/saveLaptop")
    public ResponseEntity<Integer> saveLaptop(@RequestBody Teacher teacher) {
		int tId = teacherService.saveTeacher(teacher);
        return ResponseEntity.ok(tId);
    }
    
    
    @GetMapping("/laptop")
    public Optional<Classes> getLaptop(@RequestParam("sId") int sId) {
    	return Optional.of(classesRepository.findById(sId).orElse(null));
        
    }
    
    @GetMapping("/student")
    public Optional<Teacher> getStudent(@RequestParam("sId") int sId) {
    	return Optional.of(teacherRepository.findById(sId).orElse(null));
        
    }
	

}
