package com.careerit.cj.day3;

import java.util.Scanner;

public class CheckNumber {

		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the num:");
				int num = sc.nextInt();
				
				if(num % 2 == 0 || num % 5 == 0) {
					System.out.println("Success");
				}else {
					System.out.println("Fail");
				}
				sc.close();
				
		}
}
