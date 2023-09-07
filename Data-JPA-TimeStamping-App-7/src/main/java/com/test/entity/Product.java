package com.test.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	private Integer productId;
	private String productName;
	private Double productPrice;
	
	
	@CreationTimestamp
	@Column(name="insert_date", updatable=false) // updatable=false bcz, during updation don't update the "CreateDate" column
	private LocalDateTime createDate;
	
	
	@UpdateTimestamp
	@Column(name="last_update_date", insertable=false) // insertable=false bcz, during insertion don't insert any data-time in "UpdateDate" column
	private LocalDateTime updateDate;
}
