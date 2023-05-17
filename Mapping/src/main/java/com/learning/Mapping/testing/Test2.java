package com.learning.Mapping.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.Mapping.entity.User;

public class Test2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = factory.createEntityManager();
		User savedUser = entityManager.find(User.class, 1);
		System.out.println(savedUser);
		
		entityManager.close();
		factory.close();

	}

}
