package com.javalearning.OOP.Polymorphism;

class Shape{
	
	public static void draw(){
		System.out.println("draw() with zero arg");
	}	
	public static void draw(int a){
		System.out.println("draw() with 1 arg");
	}
}

public class Compile_time {
	public static void main(String[] args) {
//		Shape shape = new Shape();
//		shape.draw();
		
		Shape.draw();
	}

}
