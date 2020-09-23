package com.careerit.cj.day18;

public class Account {

		private int accno;
		private String name;
		private double balance;
		
		
		public Account(int accno, String name, double balance) {
			this.accno = accno;
			this.name = name;
			this.balance = balance;
		}
		
		
		public void withDraw(double amount) {
			if(amount > balance) {
				throw new InsufficientFundsException("Sorry! you don't have enough funds");
			}
		}
		public int getAccno() {
			return accno;
		}
		public void setAccno(int accno) {
			this.accno = accno;
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
