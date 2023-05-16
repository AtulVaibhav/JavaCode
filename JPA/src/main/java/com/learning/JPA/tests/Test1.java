package com.learning.JPA.tests;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Employee;

//insert

public class Test1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Aniket");
		emp.setAge(28);
		emp.setSalary(28000);
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("employeeInfo");
		EntityManager entityManager = factory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        
        transaction.begin();
        entityManager.persist(emp);
        transaction.commit();
        entityManager.close();
        factory.close();
        
        System.out.println("Object saved successfully");
	}

}
