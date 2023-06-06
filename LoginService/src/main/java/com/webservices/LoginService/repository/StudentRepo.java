package com.webservices.LoginService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservices.LoginService.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
