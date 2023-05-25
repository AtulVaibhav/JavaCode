package com.learning.Spring.p_namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/learning/Spring/p_namespace/p_namespaceconfig.xml");
         Employee emp = context.getBean("emp",Employee.class);
	     System.out.println(emp);
	}

}
