package com.javalearning.Arrays;

import java.util.Scanner;

//how to take input from user
public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter the elements:");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements of an array:");
		for(int i=0;i<size;i++){
			System.out.print(arr[i]+" ");
		}

	}

}
