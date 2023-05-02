package com.javalearning.multiThreading;

public class Booking extends Thread{
	private TicketCounter tc;
	private String passengerName;
	private int seatsRequired;
	public Booking(TicketCounter tc, String passengerName, int seatsRequired) {
		super();
		this.tc = tc;
		this.passengerName = passengerName;
		this.seatsRequired = seatsRequired;
	}
	
	public void run(){
		tc.bookingTicket(passengerName, seatsRequired);
	}
	
}
