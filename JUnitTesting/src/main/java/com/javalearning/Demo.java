package com.javalearning;

public class Demo {
	
	//1234 = 10
	public int sumOfDigit(int num){
		int sum=0;
		while(num>0){
			int rem = num%10;
			int quo = num/10;
			sum = sum +rem;
			num = quo;
		}
		return sum;
	}
	
	public boolean inEven(int num){
		boolean result = false;
		if(num%2==0){
			result = true;
		}
		return result;
	}

}
