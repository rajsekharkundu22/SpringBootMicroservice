package com.test;

public class App {

	public static void main(String[] args) {
		
		//For Constructor Injection
		//Car car = new Car(new PetrolEngine());
		
		//For Setter injection
		/*
		 * Car car = new Car(); car.setEngine(new DieselEngine());
		 */
		
		//For Field injection
		Car car = new Car();
		car.eng = new PetrolEngine();
		
		
		car.drive();

	}

}
