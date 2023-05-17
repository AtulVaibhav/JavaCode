package com.learning.Mapping.testing;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.learning.Mapping.entity.Comment;
import com.learning.Mapping.entity.Post;

public class Test4 {

	public static void main(String[] args) {
		Post post1 = new Post();
		post1.setPostName("Java");
		
		Post post2 = new Post();
		post2.setPostName("AI");
		
		Comment c1 = new Comment();
		c1.setPostComment("Java is programming language");
		
		Comment c2 = new Comment();
		c2.setPostComment("Java is object-oriented programming language");
        
		
		Comment c3 = new Comment();
		c3.setPostComment("AI is the future");
		
		Comment c4 = new Comment();
		c4.setPostComment("Python knowledge is required");
		
		
		List<Comment> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		
		List<Comment> list2 = new ArrayList<>();
		list2.add(c3);
		list2.add(c4);
		
	
		post1.setComment(list);
		post2.setComment(list2);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mapping");
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		entityManager.persist(post1);
		entityManager.persist(post2);
		entityTransaction.commit();
		
		System.out.println("Object saved successfully");
		entityManager.close();
		factory.close();
		
	}

}
