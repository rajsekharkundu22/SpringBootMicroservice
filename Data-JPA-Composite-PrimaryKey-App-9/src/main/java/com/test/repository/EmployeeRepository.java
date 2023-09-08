package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Employee;
import com.test.entity.EmployeePK;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeePK> {

}
