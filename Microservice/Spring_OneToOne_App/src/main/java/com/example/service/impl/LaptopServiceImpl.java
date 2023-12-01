package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.Laptop;
import com.example.repositories.LaptopRepository;
import com.example.service.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	private LaptopRepository laptopRepository;
	
	@Override
	public int saveLaptop(Laptop laptop) {
		Laptop laptopDetails = laptopRepository.save(laptop);
		return laptopDetails.getLaptopId();
	}

}
