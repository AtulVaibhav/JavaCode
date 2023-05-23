package com.learning.Spring;

interface T{
	void m1();
}

class T1 implements T{

	public void m1() {
		System.out.println("T1 completes task");
		
	}
	
}
class T2 implements T{

	public void m1() {
		System.out.println("T2 completes task");
		
	}
	
}

class DoSomething {
	private T t;
	DoSomething(T t){
		this.t = t;
	}
	public void doSomething(){
		t.m1();
	}
}


public class LooseCoupling {

	public static void main(String[] args) {
		T1 t1 = new T1();
		T2 t2 = new T2();
		DoSomething ds= new DoSomething(t2);
		ds.doSomething();



	}

}
