package com.javalearning.OOP.ExceptionHandling;

import java.io.IOException;

public class ExceptionIntro {
    
	public static void doCalculation(int a,int b){
		int result = a/b;//program terminates
		System.out.println(result);
		System.out.println("Calculation done successfully");
	}
	public static void doPrint(String str){
		String[] words = str.split(" ");
		for(int i=0;i<=words.length;i++){
			System.out.println(words[i]);
		}
	}
	public static void doOperation(String s){
		//System.out.println(s.length());
		for(int i=0;i<=s.length();i++){
			System.out.println(s.charAt(i));
			//throw new IOException();
		}
		System.out.println("After loop");
	}
	
	public static void main(String[] args) {
	  //ExceptionIntro.doCalculation(12,0);
      String str = "Java is programming language";
      // ExceptionIntro.doPrint(str);
      
      String str1 = null;
      String str2 = "Java";
      ExceptionIntro.doOperation(str2);
	}

}
