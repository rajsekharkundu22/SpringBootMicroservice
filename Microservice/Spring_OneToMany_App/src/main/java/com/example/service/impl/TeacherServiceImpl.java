package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Teacher;
import com.example.repositories.TeacherRepository;
import com.example.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
	private TeacherRepository teaRepo;
	
	@Override
	public int saveTeacher(Teacher teacher) {
		 Teacher teacherdetails = teaRepo.save(teacher);
		return teacherdetails.getTId();
	}

}
