package com.lambdaExpression;

import java.util.function.Function;

public class FunctionIntro {

	public static void main(String[] args) {
		Function<Integer ,String> function = value -> 2*value +" is result";
        String result = function.apply(20);
        System.out.println(result);
	}

}
