package com.test.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	private Long studentId;
	private String studentName;
	private String studentGender;
	private Integer studentAge;
}
