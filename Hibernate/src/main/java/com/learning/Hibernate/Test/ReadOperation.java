package com.learning.Hibernate.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.learning.Hibernate.entity.Student;

//loads object based on Id
public class ReadOperation {

	public static void main(String[] args) {
		Configuration configuration = new Configuration()
				  .configure("hibernate.cfg.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Student student = session.get(Student.class,new Integer(3));
		if(student==null){
			System.out.println("No object found");
		}else{
			System.out.println(student);
		}

	}

}
