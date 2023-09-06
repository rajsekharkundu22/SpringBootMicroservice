package com.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.entity.Book;
import com.test.repository.BookRepository;

@SpringBootApplication
public class DataJpaCustomQueryApp4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ccontext = SpringApplication.run(DataJpaCustomQueryApp4Application.class, args);
		BookRepository bookRepo = ccontext.getBean(BookRepository.class);
		
		List<Book> books = bookRepo.getAllBookDetails();
		for(Book book : books) {
			System.out.println(book);
		}
	
	}

}
