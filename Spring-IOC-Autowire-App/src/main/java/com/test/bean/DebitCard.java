package com.test.bean;

public class DebitCard implements IPayment{

	public boolean processPayment(double ammount) {
		System.out.println("Debit card payment successfull. Pay ammount " + ammount);
		return true;
	}

}
