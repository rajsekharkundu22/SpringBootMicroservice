package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{

}
