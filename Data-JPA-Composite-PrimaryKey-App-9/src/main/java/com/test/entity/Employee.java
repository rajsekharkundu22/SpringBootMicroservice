package com.test.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Employee {

	@EmbeddedId
	private EmployeePK employeePK;
	
	
	private String empName;
	private Double empSalary;
}
