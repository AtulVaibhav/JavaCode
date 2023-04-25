package com.lambdaExpression;

@FunctionalInterface
interface FindIndex{
	int getIndex(String[] arr,String key);
}

class SearchName{
	public int getPosition(String[] arr,String key){
		
		for(int i=0;i<arr.length;i++){
			if(arr[i].equals(key)){
				return i;
			}
		}
		return -1;
	}
}


public class Problem3 {

	public static void main(String[] args) {
		String[] arr = {"Akash","Mayank","Harsh","Ankit","Ravi"};
		String key = "Harsh";
		SearchName search = new SearchName();
		FindIndex findIndex = search::getPosition;
        int result = findIndex.getIndex(arr, key);
        System.out.println(result);
        
        //objectName.method() => objectName::method
	}

}
