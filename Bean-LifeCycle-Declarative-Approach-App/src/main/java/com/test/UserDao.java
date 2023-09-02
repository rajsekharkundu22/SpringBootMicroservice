package com.test;

public class UserDao {

	public void init() {
		System.out.println("getting db connection");
	}
	
	public void getData() {
		System.out.println("getting data from database");
	}
	
	public void destroy() {
		System.out.println("closing database conncetion");
	}
}
