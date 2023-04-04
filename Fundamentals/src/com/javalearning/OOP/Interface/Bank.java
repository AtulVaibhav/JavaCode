package com.javalearning.OOP.Interface;

public class Bank {
   private RBI rbi;    
   Bank(RBI rbi){    //rbi = new IOB()
	   this.rbi = rbi;
   }
   
   public void BankingPolicy(){
	   rbi.policy();
	   rbi.RBIPolicy();
   }
}


