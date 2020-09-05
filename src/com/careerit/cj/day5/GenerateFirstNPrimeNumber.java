package com.careerit.cj.day5;

import java.util.Scanner;

public class GenerateFirstNPrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lb :");
		int lb = sc.nextInt();
		System.out.println("Enter the ub :");
		int ub = sc.nextInt();

		for (int i = lb; i <= ub; i++) {
				
			boolean res = isPrime(i);
			if(res) {
				System.out.print(i+" ");
			}
				
		}
		
		System.out.println("\n--------------------------------");
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		
		int count = 0;
		for(int i=1; ;i++) {
			
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
			
			if(count == n) {
				break;
			}
			
		}
		
		
		sc.close();

	}

	public static boolean isPrime(int num) {

		if (num < 0) {
			return false;
		}

		if (num % 2 == 0 && num != 2) {
			return false;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
