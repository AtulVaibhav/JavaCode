package com.javalearning.Arrays;

import java.util.Scanner;

public class TwoDimensional_Array {

	public static void main(String[] args) {
		//declare an array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int cols = sc.nextInt();
		
		int a[][] = new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elements in 2D array:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
			}
		
		
	}
