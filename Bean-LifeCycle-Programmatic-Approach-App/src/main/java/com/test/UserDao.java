package com.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean, DisposableBean{

	
	public void afterPropertiesSet() throws Exception {
		System.out.println("getting db connection");
		
	}
	public void getData() {
		System.out.println("getting Data from Database");
	}
	
	public void destroy() throws Exception {
		System.out.println("Closing DB connection");
		
	}
	

}
