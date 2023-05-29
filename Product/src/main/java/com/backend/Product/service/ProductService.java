package com.backend.Product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.Product.entity.Product;
import com.backend.Product.repository.ProductRepository;

@Service
public class ProductService {
	
    @Autowired
	ProductRepository productRepository;
    
	public String addProduct(Product product){
		productRepository.save(product);
		return "product saved successfully";
	}
	
	public Product getProduct(int id){
		Product product =  productRepository.findById(id).get();
	  if(product!=null){
		  return product;
	  }
	  return null;
	
	}
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	
	public String updateProduct(Product newProduct,int id){
		Product oldProduct = productRepository.findById(id).get();
	    if(oldProduct!=null){
	      //oldProduct.setProductId(newProduct.getProductId());
		  oldProduct.setProductName(newProduct.getProductName()); 
	      oldProduct.setProductImageURL(newProduct.getProductImageURL());
	      productRepository.save(oldProduct);
	      
	      return "Product updated successfully";
	    }
	    return "Updation failed";
	
	}
	
	public String deleteProduct(int id){
		Product product = productRepository.findById(id).get();
	    if(product!=null){
	    	productRepository.delete(product);
	    	return "Product with id "+id+" deleted successfully";
	    }
	    return "No product found with id "+id;
	
	}
	public Product searchProduct(String productName){
		return null;
	}
}
