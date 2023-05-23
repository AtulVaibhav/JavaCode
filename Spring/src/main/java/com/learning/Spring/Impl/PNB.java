package com.learning.Spring.Impl;

import com.learning.Spring.interfaces.RBI;

public class PNB implements RBI {

	@Override
	public void policy() {
		System.out.println("PNB Policy");
	}

}
