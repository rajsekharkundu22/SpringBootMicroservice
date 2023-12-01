package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Classes;
import com.example.repositories.ClassesRepository;
import com.example.service.ClassesService;

@Service
public class ClassServiceImpl implements ClassesService {

	@Autowired
	private ClassesRepository classesRepository;
	
	@Override
	public String saveClasses(List<Classes> classes) {
		 classesRepository.saveAll(classes);
		return "Save";
	}

}
