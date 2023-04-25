package com.lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInfo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		Consumer<List<Integer>> consumer = mylist -> {
			for(int i=0;i<mylist.size();i++){
				mylist.set(i, 2*(mylist.get(i)));
			}
		};
		consumer.accept(list);
		System.out.println("After applying changes:");
		System.out.println(list);
		
	}

}
