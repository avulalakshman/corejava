package com.careerit.cj.day10;

public class Account {

	int accno;
	String name;
	double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void withDraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("After withdraw balance is:" + balance);
		} else {
			System.out.println("Sorry! you don't sufficient funds, the balance is:" + balance);
		}
	}

	public void deposite(double amount) {

		balance += amount;
		System.out.println("After deposite the balance is:" + balance);
	}
	
	public void showInfo() {
		System.out.println("Accno     :"+accno);
		System.out.println("Name      :"+name);
		System.out.println("Balance   :"+balance);
	}

}
