package com.careerit.cj.day10;

public class AccountManager {

	public static void main(String[] args) {

		Account acc1 = new Account(1001, "Krish", 350000);
		Account acc2 = new Account(1010, "Naresh", 32000);
		Account acc3 = new Account(1020, "Jayesh", 530000);
		Account acc4 = new Account(1030, "Maniesh", 32000);
		Account acc5 = new Account(1040, "Ramana", 450000);
		Account acc6 = new Account(1050, "Venakt", 42000);
		Account acc7 = new Account(1060, "Tanvi", 450000);
		Account acc8 = new Account(10700, "Sai", 2000);
		Account acc9 = new Account(1080, "Lavanya", 150000);
		Account acc10 = new Account(1090, "Nagamani", 12000);

		Account[] accArr = { acc1, acc2, acc3, acc4, acc5, acc6, acc7, acc8, acc9, acc10 };
		
		for(Account acc:accArr) {
			acc.deposite(5000);
		}
		
		
		
		for(Account acc:accArr) {
			acc.showInfo();
			System.out.println("--------------------------");
		}
		
		// Get max amount account holder details
		
		// Find total amount of all the account holder
		
		// Display account holder details, whose balance is more 100000
		
		// Display all the account holder in sorting (descending) order by balance 

	}
}
