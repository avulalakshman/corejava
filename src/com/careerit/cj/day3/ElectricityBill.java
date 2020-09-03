package com.careerit.cj.day3;

import java.util.Scanner;

public class ElectricityBill {
	
		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				
				int min_amount = 50;
				int unit_price=0;
				
				System.out.println("Enter the used units :");
				int units = sc.nextInt();
				
				
				if(units >=1 && units <=100) {
					unit_price = 3;
				}else if(units>100 && units <=500) {
					unit_price = 4;
				}else {
					unit_price = 8;
				}
				
				int total_bill = units * unit_price + min_amount;
				System.out.println("-----------------------------------");
				System.out.println("Min bill amount   :"+min_amount);
				System.out.println("Used units        :"+units);
				System.out.println("Unit price        :"+unit_price);
				System.out.println("Total bill amount :"+total_bill);
				System.out.println("-----------------------------------");
				sc.close();
			
		}
}
