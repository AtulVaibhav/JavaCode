package com.learning.Spring.FactoryMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("com/learning/Spring/FactoryMethod/productConfiguration.xml");
		Product product = (Product) context.getBean("product");		
        product.getDescription();
	}

}
