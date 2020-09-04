package com.careerit.cj.day4;

import java.util.Scanner;

public class PatternNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num value:");
		int num = sc.nextInt();

		int r = num % 3 == 0 ? num / 3 : num / 3 + 1;
		int col = 3;
		int c = 1;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= col; j++) {
				System.out.print(c++ + " ");
				if (c > num) {
					break;
				}
			}
			System.out.println();
		}

		sc.close();

	}
}
