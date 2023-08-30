package com.test;

public class SodexoCard implements IPayment{

	
	public boolean processPayment() {
		System.out.println("Sodexo card payment done");
		return true;
	}

}
