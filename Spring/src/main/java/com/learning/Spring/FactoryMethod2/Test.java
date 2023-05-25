package com.learning.Spring.FactoryMethod2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new
				ClassPathXmlApplicationContext("com/learning/Spring/FactoryMethod2/deviceConfig.xml");
	   ElectronicDevices devices = (ElectronicDevices) context.getBean("device");
	   devices.getElectronicGoods();
	}

}
