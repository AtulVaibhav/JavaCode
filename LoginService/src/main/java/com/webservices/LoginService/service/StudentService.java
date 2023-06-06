package com.webservices.LoginService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.LoginService.entity.Student;
import com.webservices.LoginService.repository.StudentRepo;
@Service
public class StudentService {
    @Autowired
	StudentRepo repo;
	public Student save(Student student){
		Student st = repo.save(student);
		if(st!=null){
			return st;
		}
		return null;
	}
}
