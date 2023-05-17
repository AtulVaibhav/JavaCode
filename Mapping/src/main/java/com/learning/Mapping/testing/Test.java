package com.learning.Mapping.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.Mapping.entity.Address;
import com.learning.Mapping.entity.User;

//insert

public class Test {

	public static void main(String[] args) {
		Address addr = new Address();
		addr.setCity("Bangalore");
		addr.setState("Karnataka");
		
		User user1 = new User();
		user1.setName("Aayush");
		user1.setEmail("aayush@gmail.com");
		user1.setAddress(addr);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(user1);
		transaction.commit();
		
		System.out.println("Object saved successfully..");
		entityManager.close();
		factory.close();

	}

}
