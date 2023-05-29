package com.backend.Product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.Product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
