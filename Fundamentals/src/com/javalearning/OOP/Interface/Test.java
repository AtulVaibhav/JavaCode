package com.javalearning.OOP.Interface;


interface Department{
	//public & abstract
	//public abstract void m1()
	void m1();
	int a =20;
}


//interface Account extends Department{
//	void m2();
//}
//
//
//interface Account implements Department{
//	
//}

class ABC implements Department{

//	@Override
//	public void m2() {
//		
//		
//	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Test {

	public static void main(String[] args) {
		System.out.println(Department.a);//public ,static
		//Department.a =150;//final
		
	}

}


