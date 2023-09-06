package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.test.entity.Book;
import com.test.repository.BookRepository;

@SpringBootApplication
public class DataJpaCrudMethodApp3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ccontext = SpringApplication.run(DataJpaCrudMethodApp3Application.class, args);
		
		BookRepository repo = ccontext.getBean(BookRepository.class);
		
		Book b = new Book();
		
		b.setBookId(2);
		b.setBookName("Gopal Var");
		b.setBookPrice(130.00);
		
		Book b2 = new Book();
		b2.setBookId(4);
		b2.setBookName("Bhim");
		b2.setBookPrice(300.00);
	
		//repo.save(b);
		
		//repo.saveAll(Arrays.asList(b,b2));
		
		//boolean status = repo.existsById(2);
		//System.out.println(status);
		
		//long count = repo.count();
		//System.out.println(count);
		
		/*
		 * Optional<Book> findById =repo.findById(1); if(findById.isPresent()) {
		 * System.out.println(findById.get()); }
		 */
		 
		/*
		 * Iterable<Book> findAllById=repo.findAllById(Arrays.asList(3,4)); for (Book
		 * book : findAllById) { System.out.println(book); }
		 */
		
		//Iterable<Book> findAll = repo.findAll();
		//for(Book book : findAll) {
			//System.out.println(book);
		//}
			
		//if(repo.existsById(1)) {
		//repo.deleteById(1);
		//}
		
		//repo.deleteAllById(Arrays.asList(1,2));
		
		//repo.delete(b2);
		
		//repo.deleteAll(Arrays.asList(b,b2));
		
		//repo.deleteAll();
		
		//use of findBy method
		List<Book> books = repo.findByBookPriceGreaterThanEqual(200.00);
		for(Book book : books) {
			System.out.println(book);
		}
	}

}
