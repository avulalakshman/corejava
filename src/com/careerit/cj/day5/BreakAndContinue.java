package com.careerit.cj.day5;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
				if(i % 3 == 0) {
					continue;
				}
				System.out.println(i);
			
		}
		System.out.println("--------------------------");
		for(int i=1;i<=n;i++) {
				
				if(i >= 5) {
					break;
				}
				System.out.println(i);
		}

		sc.close();

	}
}
