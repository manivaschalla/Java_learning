package com;

public class Bank {
	
	private int accountNumber;
	private double balance;
	//private int pinNum;
	
	//Getters and setters
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(double balance) {
		if(balance > 0) {
			this.balance = balance;
		}else {
			System.out.println("Enter valid amount to Balance");
		}
		
	}

}

