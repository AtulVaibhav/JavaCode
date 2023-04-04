package com.javalearning.OOP.Polymorphism;

class Shape2{
	public void draw(){
		System.out.println("Inside Shape class");
	}
}

class Circle extends Shape2{
	@Override
	public void draw(){
	
		System.out.println("Inside Circle class");
	}
}

class Rectangle extends Shape2{
	@Override
	public void draw(){
		super.draw();
		System.out.println("Inside Rectangle class");
	}
}


public class Runt_time {

	public static void main(String[] args) {
//		Circle circle = new Circle();
//		circle.draw();

		// If a parent type reference points to child type object,
		//this is called as dynamic dispatch
//		Shape2 shape = new Circle();
//		shape.draw();
		Shape2 shape2 = new Rectangle();
		shape2.draw();
	}

}
//Run-time :late binding
//depends on type of object
//method overriding