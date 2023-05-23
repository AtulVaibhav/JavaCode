package com.learning.Spring.constructorInjection.primitiveType;

public class Student2 {
	private int studentId;
	private String studentName;
	
	public Student2() {
		System.out.println("Constructor with zero arg");
		
	}
	public Student2(int studentId) {
		System.out.println("Constructor with one arg");
	}
	public Student2(int studentId, String studentName) {
		System.out.println("Constructor with two arg");
		
	}
	
	public String toString(){
		return "Object created";
	}
	
	

}
