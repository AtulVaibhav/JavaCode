package com.lambdaExpression;

@FunctionalInterface
interface Display{
	void show();
}

class Example{
	public void m1(){
		System.out.println("display() is called");
	}
	
	public static void m2(){
		System.out.println("m2() is referred");
	}
}



public class MethodReference1 {

	public static void main(String[] args) {
		//using lambda 
		Display display = ()->System.out.println("display() is called");
         display.show();
         
       //using MethodReference to instance method
         Example example = new Example();
         Display output =example::m1;
         output.show();
         
       //using MethodReference to static method
         Display result = Example::m2;
         result.show();
         
	}

}
