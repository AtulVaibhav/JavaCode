package com.learning.Hibernate.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.learning.Hibernate.entity.Student;

public class DeleteOperation {

	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				  .configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.getTransaction();
		session.beginTransaction();
		Student student = session.get(Student.class,new Integer(3));
		if(student==null){
			System.out.println("No object found");
		}else{
			session.delete(student);
			tx.commit();
			System.out.println("object deleted successfully");
		}


	}

}
