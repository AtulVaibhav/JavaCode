package com.webservices.LoginService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservices.LoginService.entity.User;
import com.webservices.LoginService.service.UserService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@PostMapping("/login")
	public ResponseEntity<?> loginCredential(@RequestBody User newUser){
		System.out.println(newUser);
		User storedUser =  userService.getById(newUser.getUserId());
	    if(storedUser.getPassword().equals(newUser.getPassword())){
	    	return ResponseEntity.ok(newUser);
	    }
	  return (ResponseEntity<?>) ResponseEntity.internalServerError();
	      
	}

}
