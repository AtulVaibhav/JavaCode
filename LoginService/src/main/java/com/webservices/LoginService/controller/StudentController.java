package com.webservices.LoginService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.LoginService.entity.Student;
import com.webservices.LoginService.service.StudentService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/student")
public class StudentController {
    @Autowired
	StudentService studentService;
	@PostMapping("/registration")
	public ResponseEntity<?> saveStudent(@RequestBody Student student){
		Student savedStudent = studentService.save(student);
		if(savedStudent!=null){
			return ResponseEntity.ok(savedStudent);
		}
		return (ResponseEntity<?>) ResponseEntity.internalServerError();
	}
	

}
