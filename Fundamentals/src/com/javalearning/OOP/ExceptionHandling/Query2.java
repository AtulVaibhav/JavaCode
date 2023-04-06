package com.javalearning.OOP.ExceptionHandling;

public class Query2 {
	public static void m1(){
    	try{
    		System.out.println("Inside outer try");
    		try{
    			int result = 12/0;
    		}catch(ArithmeticException ae){
    			String str = null;
    			System.out.println("inside inner catch");
    			int data = str.length();
    		}finally{
    			System.out.println("Inside finally block");
    		}
    	}catch(Exception e){
    		System.out.println("Inside outer catch");
    	}
		
		
    }
	public static void main(String[] args) {
		m1();

	}

}
