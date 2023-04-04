package com.javalearning.OOP.Encapsulation;

class Product{
	private int productId=101;
	private String productName="Headphone";
	private String productDesc="It's a nice product";
	
	public int getProductId(){
		return this.productId;
	}
	public String getProductName(){
		return this.productName;
	}
	public String getProductDesc(){
		return this.productDesc;
	}
	
}


public class Test {

	public static void main(String[] args) {
		Product p1 = new Product();
		int id = p1.getProductId();
		System.out.println(id);

	}

}
