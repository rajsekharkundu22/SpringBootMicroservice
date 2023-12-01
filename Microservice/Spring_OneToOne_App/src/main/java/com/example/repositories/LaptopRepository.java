package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

}
