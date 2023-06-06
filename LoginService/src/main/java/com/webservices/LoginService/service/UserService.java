package com.webservices.LoginService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservices.LoginService.entity.User;
import com.webservices.LoginService.repository.UserRepo;

@Service
public class UserService {
	@Autowired
	UserRepo userRepo;
	public User getById(int id){
		return userRepo.findById(id).get();
	}
	

}
