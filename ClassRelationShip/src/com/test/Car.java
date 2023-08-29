package com.test;

public class Car extends Maruti {

	public void carType() {
		// IS-A relationship : Red Maruti is a car

		String carColor = super.color();
		System.out.println(carColor);
	}

	public void drive() {

		// HAS-A relationship : Car has a engine

		Engine eng = new Engine();
		int status = eng.start();
		if (status >= 1) {
			System.out.println("Car started");
		} else {
			System.out.println("Engine problem");
		}
	}
}
