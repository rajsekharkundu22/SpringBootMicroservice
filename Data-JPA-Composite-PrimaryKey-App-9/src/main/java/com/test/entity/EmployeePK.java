package com.test.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class EmployeePK implements Serializable{
	
	private Integer empId;
	private Integer empDepartmentId;

}
