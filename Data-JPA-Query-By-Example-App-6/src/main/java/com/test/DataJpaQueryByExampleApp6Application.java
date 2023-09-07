package com.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;

import com.test.entity.Student;
import com.test.repository.StudentRepository;

@SpringBootApplication
public class DataJpaQueryByExampleApp6Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ccontext = SpringApplication.run(DataJpaQueryByExampleApp6Application.class, args);
		
		StudentRepository stuRepo = ccontext.getBean(StudentRepository.class);
		
//		Student s1 = new Student(1l,"Alex","Male",26);
//		Student s2 = new Student(2l,"Jhon","Male",28);
//		Student s3 = new Student(3l,"Sima","Female",26);
//		Student s4 = new Student(4l,"Manish","Male",26);
//		Student s5 = new Student(5l,"Asima","Female",36);
//		Student s6 = new Student(6l,"Shankar","Male",24);
//		Student s7 = new Student(7l,"Ayush","Male",25);
//		Student s8 = new Student(8l,"Soma","Female",28);
//		
//		stuRepo.saveAll(Arrays.asList(s1,s2,s3,s4,s5,s6,s7,s8));
		
		
		//Query By Example
		
		
		  Student student = new Student();
		  student.setStudentGender("Male");
		  student.setStudentAge(28);
		  
		  Example<Student> ex=Example.of(student);
		  List<Student> stu = stuRepo.findAll(ex);
		 
		
		  for(Student st : stu)
		  {
			  System.out.println(st);
		  }
		 
		
	}

}
