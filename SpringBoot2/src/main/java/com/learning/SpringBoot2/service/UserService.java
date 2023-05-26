package com.learning.SpringBoot2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.learning.SpringBoot2.entity.User;

@Service
public class UserService {
  public static List<User> list = new ArrayList<>();
  
  static{
	  User user1 = new User(1,"user1");
	  User user2 = new User(2,"user2");
	  User user3 = new User(3,"user3");
	  User user4 = new User(4,"user4");
	  User user5 = new User(5,"user5");
	  User user6 = new User(6,"user6");
	  
	  list.add(user1);
	  list.add(user2);
	  list.add(user3);
	  list.add(user4);
	  list.add(user5);
	  list.add(user6);
  }
  
  
  public List<User> getAllUser(){
	  return list;
  }
  
  
  public User getByid(int id){
	return list.stream().filter(user ->user.getId()==id).findFirst().get();
	 
  }
  
  
  
  public String createUser(User user){
	  if(user==null){
		  return "there is some error";
	  }
	  User newUser = new User();
	  newUser.setId(user.getId());
	  newUser.setName(user.getName());
	  list.add(newUser);
	  return "User added successfully";
  }
  
  
  public String deleteById(int id){
	 User userObj =  list.stream()
			 .filter(user->user.getId()==id)
			 .findFirst().get();
	 if(userObj==null){
		return "User not found"; 
		 
	 }
	 list.remove(userObj);
	 return "User deleted successfully";
	 
	 
	
  }
  
}
