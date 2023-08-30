package com.test;

public class PaymentService {
	
	private IPayment payment;
	
	/*
	 * public PaymentService(IPayment payment) { this.payment = payment; }
	 */
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}

	public void doPayment() {
		
		boolean status = payment.processPayment();
		if(status) {
			System.out.println("Transaction Successfull");
		}else {
			System.out.println("Problem in payment process");
		}
	}
}
