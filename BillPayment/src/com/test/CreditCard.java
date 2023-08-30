package com.test;

public class CreditCard implements IPayment{

	
	public boolean processPayment() {
		System.out.println("Credit card payment done");
		return true;
	}

}
