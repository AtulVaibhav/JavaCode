package com.learning.Spring.scope.Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	 ApplicationContext context = new
			 ClassPathXmlApplicationContext("com/learning/Spring/scope/Singleton/config.xml");
    
	 User user1 = context.getBean("user1",User.class);
	 User user2 = context.getBean("user1",User.class);
	 
	 if(user1==user2){
		 System.out.println("Pointing to same location");
	 }else{
		 System.out.println("Pointing to different locations");
	 }
	 
	 
	}

}
