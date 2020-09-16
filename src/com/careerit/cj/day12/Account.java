package com.careerit.cj.day12;
import static com.careerit.cj.day12.AccountUtil.*;

public class Account  {

	String accNumber;
	String name;
	double balance;

	public Account(String accNumber, String name, double balance) {
		super();
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		
		if(amount <= balance) {
			this.balance -= amount;
			System.out.println("Currenct balance of :"+maskAccountNumber(accNumber)+" : "+balance);
		}else {
			System.out.println("Sorry! you don't have enough funds :"+balance);
		}
	}
	public void deposite(double amount) {
		this.balance += amount;
		System.out.println("Currenct balance of :"+maskAccountNumber(accNumber)+" : "+balance);
	}
	
	public void showAccountInfo() {
		System.out.println("Acc number : "+maskAccountNumber(accNumber));
		System.out.println("Name       : "+name);
		System.out.println("Balance    : "+balance);
	}
	
	
}
