package com.learning.Spring.p_namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("com/learning/Spring/p_namespace/p_namespaceconfig.xml");
		Student s1 = (Student) context.getBean("student");
        System.out.println(s1);
	}

}
