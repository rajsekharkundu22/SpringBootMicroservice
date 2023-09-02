package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		UserDao dao =context.getBean(UserDao.class);
		dao.getData();
		
		ConfigurableApplicationContext ccontext = (ConfigurableApplicationContext) context;
		ccontext.close();
	}

}
