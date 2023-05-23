package com.learning.Spring.constructorInjection.collectionType;

import java.util.Set;

public class Student {
   private int id;
   private String name;
   private Set<String> courses;
public Student(int id, String name, Set<String> courses) {
	super();
	this.id = id;
	this.name = name;
	this.courses = courses;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", courses=" + courses + "]";
}
   
   
}
