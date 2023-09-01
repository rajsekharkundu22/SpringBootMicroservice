package com.test.bean;

public class CreditCard implements IPayment{
	
	public boolean processPayment(double ammount) {
		System.out.println("Credit card payment successfull. Pay ammount " + ammount);
		return true;
	}

}
