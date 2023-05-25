package com.learning.Spring.beanLifeCycle.programmatically;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("com/learning/Spring/beanLifeCycle/programmatically/config.xml");
		context.getBean("emp");
		((AbstractApplicationContext) context).close();
        
				
				
				
	}

}
