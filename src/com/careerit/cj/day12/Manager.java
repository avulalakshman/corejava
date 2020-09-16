package com.careerit.cj.day12;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {

		Account[] accArr = new Account[1000];
		
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.Create 2. Withdraw 3. Deposite 4. View 5.Exit");
			System.out.println("--------------------------------------------------\n");
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("1.Savning 2. Currenct");
				int type = sc.nextInt();
				Account account=null;
				String accNumber = Long.toString(System.currentTimeMillis());
				sc.nextLine();
				System.out.println("Enter the name:");
				String name = sc.nextLine();
				System.out.println("Enter the balance:");
				double balance = sc.nextDouble();
				if(type==1) {
					account = new SavingAccount(accNumber, name, balance);
				}else {
					account = new CurrentAccount(accNumber, name, balance);
				}
				System.out.println("Account is added successfully with id :"+accNumber);
				accArr[count++] = account;
				
			}else if(ch == 2) {
				
			}else if(ch == 3) {
				
			}else if(ch==4) {
				
				System.out.println("\nAll account details:\n");
				
				for(int i=0;i<count;i++) {
					
					Account acc = accArr[i];
					if(acc instanceof SavingAccount) {
						acc.showAccountInfo();
						System.out.println("Account type is : Savings");
					}else {
						acc.showAccountInfo();
						System.out.println("Account type is : Current");
					}
					System.out.println("*************************************");
					
				}
			}else if(ch == 5) {
				sc.close();
				System.exit(0);
			}else {
				System.out.println("Plase enter valid option");
			}
		}
	}

}
