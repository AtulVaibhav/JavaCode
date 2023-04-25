package com.mockitoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import com.mockitotest.Utility.Product;
import com.mockitotest.Utility.ServiceImpl;
import com.mockitotest.interfaces.Service;

public class ProductTst {
   
//	Service service = Mockito.mock(Service.class);
//	Product product = new Product(service);
	
	
	
	//Use of Spy:
	ServiceImpl obj = new ServiceImpl();
	Service service = Mockito.spy(obj);
	
	@Test
	public void testGetTotalCost(){
		int expectedCost = 600;
		//Mockito.when(service.totalProduct()).thenReturn(20);
		//Mockito.when(service.productPrice()).thenReturn(10);
		//assertEquals(expectedCost,product.getTotalCost());
		
		assertEquals(expectedCost,service.totalProduct()*service.productPrice());
	}
}
