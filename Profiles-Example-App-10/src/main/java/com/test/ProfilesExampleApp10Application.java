package com.test;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.entity.Student;
import com.test.repository.StudentRepository;

@SpringBootApplication
public class ProfilesExampleApp10Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ccontext = SpringApplication.run(ProfilesExampleApp10Application.class, args);
		
		StudentRepository repo = ccontext.getBean(StudentRepository.class);
		
		Student s1 = new Student();
		s1.setStuName("Alex");
		s1.setStuAge(26);
		
		Student s2 = new Student();
		s2.setStuName("Mark");
		s2.setStuAge(26);
		
		repo.saveAll(Arrays.asList(s1,s2));
		
	}

}
