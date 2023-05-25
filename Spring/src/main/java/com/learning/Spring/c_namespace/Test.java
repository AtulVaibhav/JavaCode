package com.learning.Spring.c_namespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("com/learning/Spring/c_namespace/c_namespaceconfig.xml");
        Product product = (Product) context.getBean("product");
        
        product.show();
  
	}

}
