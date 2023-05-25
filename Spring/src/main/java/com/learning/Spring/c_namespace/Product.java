package com.learning.Spring.c_namespace;

public class Product {
	private int productId;
	private String productName;
	private String productDescription;

	public Product(int productId, String productName, String productDescription) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
	}
	
	public void show(){
		System.out.println(this.productId);
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + "]";
	}

}
