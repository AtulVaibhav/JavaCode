package com.javalearning.OOP.ExceptionHandling;

public class Try_MultipleCatch {
	
	public static void doOperation(String s){
		try{
			for(int i=0;i<=s.length();i++){
				System.out.println(s.charAt(i));		
			}
		}catch(ArithmeticException ae){
			System.out.println("AE handled exception");
		}catch(NullPointerException npe){
			System.out.println("NPE handled exception");
		}catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException){
			System.out.println("SIOB handled exception");
		}catch(Exception e){
			System.out.println("Exception Parent class handled exception");
		}
	}

	public static void main(String[] args) {
		Try_MultipleCatch.doOperation("Java");

	}

}
