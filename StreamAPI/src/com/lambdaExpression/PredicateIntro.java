package com.lambdaExpression;

import java.util.function.Predicate;

public class PredicateIntro {

	public static void main(String[] args) {
		String str = "Java";
		Predicate<String> predicate = myStr -> myStr.length()>3;
        boolean result = predicate.test(str);
        System.out.println(result);
	}

}
