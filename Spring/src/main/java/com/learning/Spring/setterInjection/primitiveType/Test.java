package com.learning.Spring.setterInjection.primitiveType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context =
			new ClassPathXmlApplicationContext("com/learning/Spring/setterInjection/primitiveType/employeeConfig.xml");
     Employee employee =(Employee)context.getBean("emp");
	 employee.show();
	}
}
