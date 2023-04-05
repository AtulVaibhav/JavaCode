package com.javalearning.OOP.ExceptionHandling;

public class NestedTry_Catch {
    public static void m1(){
    	try{
    		System.out.println("Inside outer try block");
//    		String str = null;
//    		System.out.println(str.length());
    		System.out.println("Statement 1");
    		try{
    			System.out.println("Inside inner try block");
    		    System.out.println(12/0);
    		}catch(NullPointerException npe){
    			System.out.println("Handling inner try block");
    		}
    	}catch(Exception e){
    		System.out.println("Handling outer try block");
    	}
    }
	public static void main(String[] args) {
		NestedTry_Catch.m1();

	}

}
