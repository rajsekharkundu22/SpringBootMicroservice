package com.test;

public class Car {
	
	//Feild Injection
	IEngine eng;
	
	//private IEngine eng;
	
	//Constructor Injection
	/*
	 * public Car(IEngine eng) { this.eng = eng; }
	 */
	
	//Setter Injection
	public void setEngine(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		int status = eng.start();
		
		if(status >=1) {
			System.out.println("Let's drive");
		}else {
			System.out.println("Problem in Engine");
		}
	}

}
