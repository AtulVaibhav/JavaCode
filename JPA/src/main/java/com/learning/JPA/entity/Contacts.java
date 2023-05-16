package com.learning.JPA.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Contacts {
	private int number;

	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contacts(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Contacts [number=" + number + "]";
	}
	

}
