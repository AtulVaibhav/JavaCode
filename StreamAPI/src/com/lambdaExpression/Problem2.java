package com.lambdaExpression;

@FunctionalInterface
interface FindPosition{
	int getIndex(String[] arr,String key);
}

public class Problem2 {

	public static void main(String[] args) {
		String[] arr = {"Akash","Mayank","Harsh","Ankit","Ravi"};
		String key = "Harsh";
		FindPosition position = (nameArr,value) -> {
			for(int i=0;i<nameArr.length;i++){
				if(nameArr[i].equals(value)){
					return i;
				}
			}
			return -1;
		};
		int index = position.getIndex(arr, key);
		System.out.println(index);

	}

}
