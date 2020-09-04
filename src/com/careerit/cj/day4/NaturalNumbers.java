package com.careerit.cj.day4;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the N value:");
		int N = sc.nextInt();

		for (int i = N; i >= 1; i--) {
				System.out.println(i);
		}
		sc.close();
	}
}
