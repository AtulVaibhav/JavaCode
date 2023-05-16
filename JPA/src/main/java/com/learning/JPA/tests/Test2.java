package com.learning.JPA.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Employee;

//read

public class Test2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeeInfo");
		EntityManager entityManager = factory.createEntityManager();
		
		Employee emp = entityManager.find(Employee.class,2);
		if(emp!=null){
			System.out.println(emp);
		}else{
			System.out.println("No object found");
		}
		entityManager.close();
		factory.close();

	}

}
// persist Vs save
// get vs load