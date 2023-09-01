package com.test.bean;

public class SodexoCard implements IPayment{

	public boolean processPayment(double ammount) {
		System.out.println("Sodexo card payment successfull. Pay ammount " + ammount);
		return true;
	}

}
