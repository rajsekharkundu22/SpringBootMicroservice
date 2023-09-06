package com.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.test.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
	//Native SQL Query
//	@Query(value="select * from book where book_Price >= 200", nativeQuery = true)
//	public List<Book> getAllBookDetails();
	
	//HQL Query
	@Query("from Book where bookPrice >= 200")
	public List<Book> getAllBookDetails();
}
