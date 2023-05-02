package com.javalearning.multiThreading;

public class Main {

	public static void main(String[] args) {
		TicketCounter tc = new TicketCounter();
		Booking b1 = new Booking(tc,"Aman",3);
		Booking b2 = new Booking(tc,"Harsh",3);
		
		b1.start();
		b2.start();
	}

}
