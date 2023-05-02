package com.javalearning.multiThreading;

public class TicketCounter {
   private int totalNumberOfSeats = 5;
   public synchronized void bookingTicket(String pname,int seatsRequired){
	   if((totalNumberOfSeats>=seatsRequired) && (seatsRequired>0)){
		   System.out.println("Hello "+pname+" Seats booked "+seatsRequired);
		   totalNumberOfSeats -=seatsRequired;
	   }else{
		   System.out.println("Sorry "+pname+".Seats are not available ");
	   }
          
   }
}
