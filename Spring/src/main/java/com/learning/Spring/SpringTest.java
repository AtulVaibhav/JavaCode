package com.learning.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		//IoC container :ApplicationContext
      ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
       Greeting greeting =(Greeting)context.getBean("greet");
      System.out.println( greeting.getGreetingMsg());
}
}
