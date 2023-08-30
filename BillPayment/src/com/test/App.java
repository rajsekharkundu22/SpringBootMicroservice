package com.test;

public class App {

	public static void main(String[] args) {
		
		//PaymentService paymentService = new PaymentService(new CreditCard());
		
		PaymentService paymentService = new PaymentService();
		paymentService.setPayment(new DebitCard());
		paymentService.doPayment();

	}

}
