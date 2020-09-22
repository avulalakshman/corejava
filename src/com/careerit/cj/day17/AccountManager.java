package com.careerit.cj.day17;

class Account {

	private String accNumber;
	private String name;
	private double balance;

	public Account(String accNumber, String name, double balance) {
		this.accNumber = accNumber;
		this.name = name;
		if(balance < 0) {
			throw new IllegalArgumentException("Balance can't be -ve number");
		}
		this.balance = balance;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}

public class AccountManager {

		public static void main(String[] args) {
			
		}
}
