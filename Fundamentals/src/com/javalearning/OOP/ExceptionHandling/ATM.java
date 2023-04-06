package com.javalearning.OOP.ExceptionHandling;

import java.util.Scanner;

class PinVerificationFailed extends Exception{
	
}
public class ATM {
	static int count=1;
     public static void PinVerifier(String pass){
    	 if(pass.equals("1234")){
    		 System.out.println("Proceding...");
    	 }else{
    		if(count==3){
    			try {
					throw new PinVerificationFailed();
				} catch (PinVerificationFailed e) {
					// TODO Auto-generated catch block
					System.out.println("Card locked for 24 hrs.Contact your bank..");
				}
    		}else{
    			Scanner sc = new Scanner(System.in);
    			System.out.println("Enter the pin..");
    		    String pin = sc.next();
    		    count++;
    		    PinVerifier(pin);
    		    
    		}
    		
    	 }
     }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the pin..");
	    String pin = sc.next();
		ATM.PinVerifier(pin);

	}

}
