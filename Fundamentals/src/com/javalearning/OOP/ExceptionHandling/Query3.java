package com.javalearning.OOP.ExceptionHandling;

public class Query3 {
      public static void m2(){
    	  String str = null;
    	  int data = str.length();
    	  try{
    		  System.out.println("inside try");
    		  int result = 12/0;
    	  }catch(ArithmeticException ae){
    		 System.out.println("Inside AE"); 
    	  }catch(Exception e){
    		  System.out.println("Inside E");
    	  }
      }
	public static void main(String[] args) {
		m2();
	}
}
//java is programming language
//Java  Is Programming Language