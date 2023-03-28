package com.javalearning.Arrays;

//Print all even numbers 

public class Program2 {
	public static void evenNumber(int[] a){
	
    	for(int i=0;i<a.length;i++){
    		if(a[i]%2==0){
    			System.out.print(a[i]+" ");
    		}
    	}
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		evenNumber(arr);

	}

}
