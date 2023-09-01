package com.test.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		PaymentService paymentService = context.getBean(PaymentService.class);
		
		paymentService.doPayment(100.00);

	}

}
