package com.learning.Spring.setterInjection.dependentType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/learning/Spring/setterInjection/dependentType/employeeconfig.xml");
      Employee emp =  (Employee) context.getBean("emp");
      System.out.println(emp);
	}

}
