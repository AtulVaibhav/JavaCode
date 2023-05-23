package com.learning.Spring.services;

import com.learning.Spring.interfaces.RBI;

public class Bank {
	private RBI rbi;

	public RBI getRbi() {
		return rbi;
	}

	public void setRbi(RBI rbi) {
		this.rbi = rbi;
	}

	public void getPolicy() {
		rbi.policy();
	}
}
