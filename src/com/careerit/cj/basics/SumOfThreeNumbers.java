package com.careerit.cj.basics;

import java.util.Scanner;

public class SumOfThreeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num1:");
		int num_1 = sc.nextInt();
		System.out.println("Enter the num2:");
		int num_2 = sc.nextInt();
		System.out.println("Enter the num3:");
		int num_3 = sc.nextInt();
		

		int sum = num_1 + num_2 + num_3;
		float avg = sum / 3.0f;

		System.out.println("The sum of " + num_1 + ", " + num_2 + " and " + num_3 + " is : " + sum);
		System.out.println("The average of  " + num_1 + "," + num_2 + " and " + num_3 + " is :" + avg);
		sc.close();
	}
}
