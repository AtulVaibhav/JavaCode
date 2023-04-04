package com.javalearning.OOP.Interface;

public interface RBI {
	void policy();
	
	default void RBIPolicy(){
		System.out.println("RBI policy");
	}
}
