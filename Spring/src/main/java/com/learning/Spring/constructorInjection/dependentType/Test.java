package com.learning.Spring.constructorInjection.dependentType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext context = new 
			ClassPathXmlApplicationContext("com/learning/Spring/constructorInjection/dependentType/studentConfig.xml");
       Student student =  (Student) context.getBean("student");
	    System.out.println(student);
	
	}

}
