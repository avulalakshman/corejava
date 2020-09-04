package com.careerit.cj.day4;

import java.util.Scanner;

public class SumOfNnaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the N value:");
		int N = sc.nextInt();

		int res = (N * (N + 1)) / 2;
		System.out.println("Sum of first :" + N + " natural numbers is :" + res);

		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum +=  i;  // sum = sum + i;
		}
		System.out.println("Sum of first :" + N + " natural numbers is :" + sum);
		sc.close();
	}
}
