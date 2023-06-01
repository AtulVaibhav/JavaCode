package com.backend.Product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	//public List<Product> findByName(String productName);
}
