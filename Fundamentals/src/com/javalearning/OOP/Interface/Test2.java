package com.javalearning.OOP.Interface;

//Runtime polymorphism doesn't work with variables

interface Vechile{
	
	int data = 40;
	void speed();
	
    default void companyName(){
		System.out.println("TATA Motors");
	}
    
    static void numberOfWheels(){
    	System.out.println("4 wheels");
    }
}

class FourWheeler implements Vechile{
   int data = 50;
	@Override
	public void speed() {
		System.out.println("150km/hr");
		
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.companyName();
		fourWheeler.speed();
		System.out.println(fourWheeler.data);
		Vechile.numberOfWheels();
	  
		Vechile vechile = new FourWheeler();
		System.out.println(vechile.data);

	}
}
//variable:type of reference
//method: type of object