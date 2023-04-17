package com.javalearning.multiThreading;

class Mythread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread executed method");	
	}	
}
public class Test2 {
	public static void main(String[] args) {
		Mythread2 t1 = new Mythread2();
		Thread th = new Thread(t1);
		th.start();

	}

}
