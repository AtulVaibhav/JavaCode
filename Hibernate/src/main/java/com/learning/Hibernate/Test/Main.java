package com.learning.Hibernate.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.Hibernate.entity.Student;

public class Main {

	public static void main(String[] args) {
		//Student object
		Student student = new Student(1,"Ankit","Java");
		Student student2 = new Student(2,"Harsh","PHP");
		Student student3 = new Student(3,"Aniket","J2EE");
		Student student4 = new Student(4,"Aayush","DBMS");
		Student student5 = new Student(5,"Yogesh","Python");
		Configuration configuration = new Configuration()
				  .configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		session.beginTransaction();
		session.save(student);
		session.save(student2);
		session.save(student3);
		session.save(student4);
		session.save(student5);
		tx.commit();
	    System.out.println("Object saved successfully");

	}

}
