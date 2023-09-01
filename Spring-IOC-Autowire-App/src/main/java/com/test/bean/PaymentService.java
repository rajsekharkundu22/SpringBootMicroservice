package com.test.bean;

public class PaymentService {
	
	private IPayment payment;
	
	//For byName, byType autowire mode working with setter injection
	/*
	 * public void setPayment(IPayment payment) { this.payment=payment; }
	 */
	
	//For Constructor autowire mode
	PaymentService(IPayment payment){
		this.payment = payment;
	}
	
	public void doPayment(double ammount) {
		
		boolean status = payment.processPayment(ammount);
		if(status) {
			System.out.println("Transaction successfull");
		}else {
			System.out.println("Card Declined");
		}
	}

}
