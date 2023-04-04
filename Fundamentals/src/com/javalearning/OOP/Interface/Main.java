package com.javalearning.OOP.Interface;

public class Main {

	public static void main(String[] args) {
		PNB pnb = new PNB();
		SBI sbi = new SBI();
		IOB iob = new IOB();
		Bank bank = new Bank(iob);
		bank.BankingPolicy();
	}

}
