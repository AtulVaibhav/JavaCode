package com.learning.SpringBoot2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringBoot2.entity.User;
import com.learning.SpringBoot2.service.UserService;

@RestController
public class FrontController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/api/getUsers")
	public List<User> getAll(){
		return userService.getAllUser();
	}
   
	@GetMapping("/api/getUser/{id}")
	public User getUser(@PathVariable int id){
		return userService.getByid(id);
	}
//	
//	@PostMapping("/api/createUser")
//	public String createUser(User user){
//		return userService.createUser(user);
//	}
	
	
	@DeleteMapping("/api/deleteUser/{id}")
	public String deleteById(@PathVariable int id){
		return userService.deleteById(id);
	}
	
	
}
