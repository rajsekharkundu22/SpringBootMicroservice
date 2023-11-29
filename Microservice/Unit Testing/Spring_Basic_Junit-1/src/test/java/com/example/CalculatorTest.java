package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Test.Calculator;

public class CalculatorTest {
	
	private Calculator c;
	

	@Test
	public void testAdd() {
		Calculator c = new Calculator();

		int actualResult = c.add(1, 2);
		int expectedResult = 3;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testMultiplication() {
		Calculator c = new Calculator();

		int actualResult = c.multiplication(4, 2);
		int expectedResult = 8;

		assertEquals(expectedResult, actualResult);
	}

}
