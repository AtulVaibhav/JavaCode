package com.learning.Spring.FactoryMethod;

public class Product {
   public static final Product product = new Product();
   private Product(){}
   
   public static Product getProduct(){
	   return product;
   }
   
   public void getDescription(){
	   System.out.println("Product is awesome");
   }
}
