package com.lambdaExpression;

import java.util.function.Supplier;

public class SupplierInfo {

	public static void main(String[] args) {
		Supplier<Integer> supplier = ()->(int)(Math.random()*100);
		Integer result = supplier.get();
		System.out.println(result);

	}

}
