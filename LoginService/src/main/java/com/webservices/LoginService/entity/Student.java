package com.webservices.LoginService.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="studentData")
public class Student {
	
	@Id
	private int studentId;
	private String studentName;
	private String courseEnrolled;
	
     
}
