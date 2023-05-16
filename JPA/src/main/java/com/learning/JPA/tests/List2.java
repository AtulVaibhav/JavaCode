package com.learning.JPA.tests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Address;
import com.learning.JPA.entity.Learners;

public class List2 {

	public static void main(String[] args) {
		Address a1 = new Address();
		a1.setCity("Bangalore");
		a1.setState("Karnataka");
		List<Address> list = new ArrayList<>();
		list.add(a1);
		
		Learners l1 = new Learners();
		l1.setName("Aayush");
		l1.setAddress(list);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeeInfo");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
	
	    entityTransaction.begin();
	   
	   System.out.println("Saving object...");
	   
	   entityManager.persist(l1);
	   
	   entityTransaction.commit();
	   entityManager.close();
	   factory.close();
	   
	   System.out.println("Object saved successfully.");


	}

}
