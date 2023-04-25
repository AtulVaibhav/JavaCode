package com.mockitotest.Utility;

import com.mockitotest.interfaces.Service;

public class Product {
   Service service;
   public Product(Service service){
	   this.service = service;
   }
   
   public int getTotalCost(){
	  return service.totalProduct() * service.productPrice();
   }
}
