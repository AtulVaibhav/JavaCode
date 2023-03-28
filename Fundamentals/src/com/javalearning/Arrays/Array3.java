package com.javalearning.Arrays;

public class Array3 {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int b[] = arr;
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Elements of b[]:");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		b[1]++;
		System.out.println("After modification");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Elements of b[]:");
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		
		
		

	}

}
