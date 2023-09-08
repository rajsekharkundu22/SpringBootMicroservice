package com.test;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.entity.Employee;
import com.test.entity.EmployeePK;
import com.test.repository.EmployeeRepository;

@SpringBootApplication
public class DataJpaCompositePrimaryKeyApp9Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ccontext = SpringApplication.run(DataJpaCompositePrimaryKeyApp9Application.class, args);
		
		EmployeeRepository repo = ccontext.getBean(EmployeeRepository.class);
		
		/*
		 * EmployeePK empPK = new EmployeePK(); empPK.setEmpId(1);
		 * empPK.setEmpDepartmentId(2);
		 * 
		 * Employee emp = new Employee();
		 * 
		 * emp.setEmployeePK(empPK); emp.setEmpName("Alex");
		 * emp.setEmpSalary(1100000.00);
		 * 
		 * repo.save(emp);
		 */
		
		//Retrieve data for composite
		
		EmployeePK empPk2 = new EmployeePK();
		empPk2.setEmpId(1);
		empPk2.setEmpDepartmentId(2);
		
		Optional<Employee> emp= repo.findById(empPk2);
		if(emp.isPresent()) {
			System.out.println(emp);
		}
	}

}
