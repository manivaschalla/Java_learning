package com;

public class Account {
	public static void main(String[] args) {
		
		Bank account1 = new Bank();
		
		account1.setAccountNumber(12345);
		account1.setBalance(50000);
		
		System.out.println(account1.getAccountNumber());
		System.out.println(account1.getBalance());
	}

}
