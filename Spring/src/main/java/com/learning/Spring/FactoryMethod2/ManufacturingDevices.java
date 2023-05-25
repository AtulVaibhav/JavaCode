package com.learning.Spring.FactoryMethod2;

public class ManufacturingDevices {
	
	//factory method
   public static ElectronicDevices manufactureGoods(){
	   return new Laptop();
   }
}
