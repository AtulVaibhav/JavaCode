package com.learning.Spring.autowiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context = new
			ClassPathXmlApplicationContext("com/learning/Spring/autowiring/byName/config.xml");
    
	User user = (User) context.getBean("user");
	System.out.println(user);
	}

}
