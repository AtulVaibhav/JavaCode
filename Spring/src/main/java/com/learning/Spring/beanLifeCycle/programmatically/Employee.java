package com.learning.Spring.beanLifeCycle.programmatically;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy()");
	}
    
	public Employee(){
		System.out.println("constructor is called");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside afterPropertiesSet()");
		
	}

}
