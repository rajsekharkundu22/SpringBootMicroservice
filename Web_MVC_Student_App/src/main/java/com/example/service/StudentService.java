package com.example.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.biding.StudentBinding;
import com.example.entity.StudentEntity;
import com.example.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	
	public boolean saveStudentDetails(StudentBinding stuBinding) {
		StudentEntity stuEntity = new StudentEntity();
		BeanUtils.copyProperties(stuBinding, stuEntity);
		stuEntity.setTimings(Arrays.toString(stuBinding.getTimings()));
		
		repo.save(stuEntity);
		
		return true;
	}
	
	
	public List<String> getCources (){
		
		return Arrays.asList("Java", "Python", "AWS", "DevOps");
	}
	
public List<String> getTimings (){
		
		return Arrays.asList("Morning", "AfterNoon", "Evening");
	}

}
