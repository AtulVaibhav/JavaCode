package com.learning.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.Spring.services.Bank;

public class PolicyTest {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationConfig.xml");
	Bank bank = (Bank)context.getBean("bank");
    bank.getPolicy();
	}

}
