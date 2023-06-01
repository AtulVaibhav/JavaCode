package com.backend.Product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.Product.entity.Product;
import com.backend.Product.service.ProductService;


@RestController
public class ProductController {
    @Autowired
	ProductService productService;
	
	@PostMapping("/api/v1/product")
	public String addProduct(@RequestBody Product product){
		return productService.addProduct(product);
	}
	
	@GetMapping("/api/v1/product/{id}")
	public Product getProduct(@PathVariable int id){
		return productService.getProduct(id);
	}
	@CrossOrigin("http://localhost:4200/")
	@GetMapping("/post")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@PutMapping("/api/v1/product/{id}")
	public String updateProduct(@PathVariable int id,@RequestBody Product product){
		return productService.updateProduct(product,id);
	}
	
	@DeleteMapping("/api/v1/product/{id}")
	public String deleteProduct(@PathVariable int id){
		return productService.deleteProduct(id);
	}
//	
//	@GetMapping("/api/v1/product/{productName}")
//	public List<Product> searchProduct(@PathVariable String productName){
//		return productService.searchProduct(productName);
//	}
//	
	
}
