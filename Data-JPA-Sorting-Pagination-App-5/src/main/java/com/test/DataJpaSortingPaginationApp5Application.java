package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.test.entity.Employee;
import com.test.repository.EmployeeRepository;

@SpringBootApplication
public class DataJpaSortingPaginationApp5Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ccontext = SpringApplication.run(DataJpaSortingPaginationApp5Application.class, args);
		
		EmployeeRepository repo = ccontext.getBean(EmployeeRepository.class);
		
		/*
		 * Employee e1 = new Employee(1L,"Alex",1000.00); Employee e2 = new
		 * Employee(2L,"Maya",2000.00); Employee e3 = new Employee(3L,"Jhon",4000.00);
		 * Employee e4 = new Employee(4L,"Shiva",2300.00); Employee e5 = new
		 * Employee(5L,"Asima",1500.00); Employee e6 = new
		 * Employee(6L,"Manish",7000.00); Employee e7 = new
		 * Employee(7L,"Shankar",10000.00); Employee e8 = new
		 * Employee(8L,"Ayush",7500.00);
		 * 
		 * repo.saveAll(Arrays.asList(e1,e2,e3,e4,e5,e6,e7,e8));
		 */

	//Sorting
		
		//Single column Sorting In Data JPA
		/*
		 * Sort sortByAsc = Sort.by("empName").ascending(); List<Employee> empList =
		 * repo.findAll(sortByAsc);
		 */
		 
		 //Multi columns Sorting In Data JPA
			//Sort sortByAsc = Sort.by("empSalary", "empName").descending();
			//List<Employee> empList = repo.findAll(sortByAsc);
			
			//for(Employee emp : empList) {
				//System.out.println(emp);
			//}
			
    //Pagination
			//PageRequest.of(pageNo, pageSize);
			int userPageNo = 2;
		Pageable page = PageRequest.of(userPageNo-1, 3);
		
		Page<Employee> findAll = repo.findAll(page);
		List<Employee> empList = findAll.getContent();
		
		for(Employee emp : empList) {
			System.out.println(emp);
		}
	}

}
