package com.learning.Mapping.testing;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.learning.Mapping.entity.Address;

public class Test3 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = factory.createEntityManager();
		Address savedAddress = entityManager.find(Address.class, 1);
        System.out.println(savedAddress.getUser());
		System.out.println(savedAddress);
        entityManager.close();
        factory.close();
	}

}
