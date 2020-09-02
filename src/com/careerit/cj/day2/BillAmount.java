package com.careerit.cj.day2;

import java.util.Scanner;

// bill amount  = ? if bill amount > 10000 give the discount 10% 

public class BillAmount {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the bill amount:");
		
		float billAmount = sc.nextFloat();
		float discount =  0;
		float netAmount = 0;
		
		if(billAmount > 10000) {
			discount = billAmount * 0.1f;
		}else {
			discount = billAmount * 0.05f;
		}
		
		netAmount = billAmount - discount;
		
		System.out.println("Thanks for shopping with us");
		System.out.println("-----------------------------");
		System.out.println("Bill amount :"+billAmount);
		System.out.println("Discount    :"+discount);
		System.out.println("Net amount  :"+netAmount);
		System.out.println("-----------------------------");
		sc.close();
		
	}
}
