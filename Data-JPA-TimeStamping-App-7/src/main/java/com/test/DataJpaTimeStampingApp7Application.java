package com.test;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.entity.Product;
import com.test.repository.ProductRepository;

@SpringBootApplication
public class DataJpaTimeStampingApp7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ccontext = SpringApplication.run(DataJpaTimeStampingApp7Application.class, args);
		
		ProductRepository repo = ccontext.getBean(ProductRepository.class);
		
		Product p1 = new Product();
		p1.setProductId(1);
		p1.setProductName("Apple");
		p1.setProductPrice(120.20);
		
		repo.save(p1);
		
		
		Optional<Product> product = repo.findById(1);
		if(product.isPresent()) System.out.println(product);
	}

}
