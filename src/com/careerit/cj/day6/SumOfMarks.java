package com.careerit.cj.day6;

import java.util.Scanner;

public class SumOfMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects: ");
		int n = sc.nextInt();
		
		

		int[] subArray = new int[n];

		for (int i = 0; i < subArray.length; i++) {
			System.out.println("Enter the subject " + (i + 1) + " score :");
			subArray[i] = sc.nextInt();
		}

		int total = 0;
		for (int i = 0; i < subArray.length; i++) {
			total = total + subArray[i];
		}
		System.out.println("Total score is :" + total);
		
		sc.close();
	}
}
