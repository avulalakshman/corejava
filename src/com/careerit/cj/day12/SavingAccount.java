package com.careerit.cj.day12;

import static com.careerit.cj.day12.AccountUtil.maskAccountNumber;

public class SavingAccount extends Account {

	double minBalance=1000;

	public SavingAccount(String accNumber, String name, double balance) {
		super(accNumber, name, balance);
	}
	
	public void withdraw(double amount) {
		if(amount <= (balance - minBalance)) {
			this.balance -= amount;
			System.out.println("Currenct balance of :"+maskAccountNumber(accNumber)+" : "+balance);
		}else {
			System.out.println("Sorry! you don't have enough funds :"+balance);
		}
	}
	
	
}
