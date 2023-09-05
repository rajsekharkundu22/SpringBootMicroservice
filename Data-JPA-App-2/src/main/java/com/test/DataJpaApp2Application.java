package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.entity.Book;
import com.test.repository.BookRepo;

@SpringBootApplication
public class DataJpaApp2Application {

	public static void main(String[] args) {
		 ConfigurableApplicationContext ccontext = SpringApplication.run(DataJpaApp2Application.class, args);
		 
		BookRepo bookRepo =  ccontext.getBean(BookRepo.class);
		
		Book book = new Book();
		book.setBookId(100);
		book.setBookName("Ninja");
		book.setBookPrice(100.12);
		
		bookRepo.save(book);
	}

}
