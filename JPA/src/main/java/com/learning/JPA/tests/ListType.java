package com.learning.JPA.tests;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.JPA.entity.Contacts;
import com.learning.JPA.entity.StudentInfo;

public class ListType {

	public static void main(String[] args) {
		Contacts c1 = new Contacts();
		c1.setNumber(1234567890);
		
		Contacts c2 = new Contacts();
		c2.setNumber(12323454);
		
		Contacts c3 = new Contacts();
		c1.setNumber(456745);
		
		Contacts c4 = new Contacts();
		c4.setNumber(45676565);
		
		List<Contacts> contacts = new ArrayList<>();
		contacts.add(c1);
		contacts.add(c2);
		
		List<Contacts> contacts2 = new ArrayList<>();
		contacts2.add(c3);
		contacts2.add(c4);
		
		StudentInfo s1 = new StudentInfo();
		s1.setName("Rahul");
		s1.setCourse("Java Development");
		s1.setContacts(contacts);
		
		StudentInfo s2 = new StudentInfo();
		s2.setName("Madhav");
		s2.setCourse("J2EE");
		s2.setContacts(contacts2);
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("employeeInfo");
        EntityManager entityManager = factory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
	
	    entityTransaction.begin();
	   
	   System.out.println("Saving objects...");
	   
	   entityManager.persist(s1);
	   entityManager.persist(s2);
	   
	   entityTransaction.commit();
	   entityManager.close();
	   factory.close();
	   
	   System.out.println("Objects saved successfully.");
	
	}

}
