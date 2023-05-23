package com.learning.Spring.constructorInjection.primitiveType;

public class Student {
	private int studentId;
	private String studentName;
	private String studentDept;

	public Student(int studentId, String studentName, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ "]";
	}

}
