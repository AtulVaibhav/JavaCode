package com.webservices.LoginService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webservices.LoginService.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
   
}
