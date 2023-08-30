package com.test;

public class DebitCard implements IPayment{

	
	public boolean processPayment() {
		System.out.println("Debit card payment done");
		return true;
	}

}
