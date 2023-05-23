package com.learning.Spring;

//Tight Coupling
class B{
	public void getData(){
		System.out.println("Hello from B");
	}
}

class A{
	public void getInfo(){
		new B().getData();
		System.out.println("getInfo completed");
	}
}

public class TightCoupling {

	public static void main(String[] args) {
		new A().getInfo();

	}

}
