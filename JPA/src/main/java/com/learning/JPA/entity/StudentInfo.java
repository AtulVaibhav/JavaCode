package com.learning.JPA.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_data")
public class StudentInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="student_name", nullable=false,length=50)
	private String name;
	
	@Column(name="course_enrolled", nullable=false,length=50)
	private String course;
	
	@ElementCollection
	private List<Contacts> contacts;
	
	

	public StudentInfo(int id, String name, String course, List<Contacts> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.contacts = contacts;
	}

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public List<Contacts> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contacts> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", course=" + course + ", contacts=" + contacts + "]";
	}
	
	

}
