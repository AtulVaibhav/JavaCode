package com.javalearning.Arrays;

//What is an array:homogeneous(similar type) data structure
//Why we need it?
//What are different types of an array:One-dimensional,Multi-dimensional
//Index position always starts with 0

public class ArrayIntro {

	public static void main(String[] args) {
		//declaring and defining an array
		// data_type nameOfArray[] = {e1,e2,e3,...,en};
         int arr[] = {1,2,3,4,5};
        
       //2. data_type nameOfArray[] = new data_type[size];
         int arr2[] = new int[5];
         
         //assigning value:
         arr2[0] = 11;
         arr2[1] = 12;
         arr2[2] = 13;
         arr2[3] = 14;
         arr2[4] = 15;
         
         
//         System.out.println(arr[0]);
//         System.out.println(arr[1]);
//         System.out.println(arr[2]);
//         System.out.println(arr[3]);
//         System.out.println(arr[4]);
         //System.out.println(arr2.length);
         //loop
         for(int i=0;i<=arr.length;i++){
        	 System.out.println(arr[i]);
         }
	}

}
