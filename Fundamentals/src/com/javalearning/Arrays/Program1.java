package com.javalearning.Arrays;

public class Program1 {
    public static void printArray(int[] a){
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" ");
    	}
    }
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		printArray(arr);
		

	}

}
