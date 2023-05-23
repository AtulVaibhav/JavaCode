package com.learning.Spring.constructorInjection.primitiveType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
	  ApplicationContext context = new 
			  ClassPathXmlApplicationContext("com/learning/Spring/constructorInjection/primitiveType/studentConfig2.xml");
	  Student2 student2 = (Student2) context.getBean("student2");
	  System.out.println(student2);

	}

}
