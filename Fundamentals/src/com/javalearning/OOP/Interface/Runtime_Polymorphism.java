package com.javalearning.OOP.Interface;

interface Service{
	void service();
}

class Service1 implements Service{
	@Override
	public void service() {
		System.out.println("Service1 implemented");	
	}
}

class Service2 implements Service{
	@Override
	public void service() {
		System.out.println("Service2 implemented");	
	}
}

public class Runtime_Polymorphism {

	public static void main(String[] args) {
		Service service = new Service1();
		Service service2 = new Service2();
		service.service();
		service2.service();
		
		Service1 obj = new Service1();
        Service2 obj2 = new Service2();
	}

}
