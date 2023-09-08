package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private Integer stuId;
	private String stuName;
	private Integer stuAge;

}
