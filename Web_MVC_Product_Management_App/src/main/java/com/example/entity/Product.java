package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pId;
	
	@NotBlank(message = "Name is mandatory")
	@Size(min =3, max =15, message="Name should have only 3 to 15 character")
	private String pName;
	
	@Positive(message = "Prive should be Positive number")
	private Double pPrice;
	private Integer qty;

}
