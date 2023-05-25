package com.learning.Spring.beanLifeCycle.byXML;

public class Product {
	private String productName;
    public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		System.out.println("Setter() is called");
	}

	public void init(){
    	System.out.println("init() method is called");
    }
     
    public Product(){
    	System.out.println("Constructor is called");
    }
    
    
    public void destroy(){
    	System.out.println("destroy() method is called");
    }
}
