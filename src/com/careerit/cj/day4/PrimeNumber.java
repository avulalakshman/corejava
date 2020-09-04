package com.careerit.cj.day4;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num value:");
		int num = sc.nextInt();
		long stime = System.currentTimeMillis();
		
		boolean isPrime = true;
		
		for (int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		
		long etime = System.currentTimeMillis();
		System.out.println(etime - stime);
		if(isPrime) {
			System.out.println(num+" is a prime");
		}else {
			System.out.println(num+" is not a prime");
		}
		sc.close();
	}
}
