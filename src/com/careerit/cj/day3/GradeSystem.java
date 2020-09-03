package com.careerit.cj.day3;

import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the score :");
		int score = sc.nextInt();

		String grade = "";

		if (score >= 90 && score <= 100) {
			grade = "A";
		} else if (score >= 70 && score < 90) {
			grade = "B";
		} else if (score >= 40 && score < 70) {
			grade = "C";
		} else {
			grade = "D";
		}

		System.out.println("Score is :" + score + " and Grade :" + grade);
		sc.close();
	}
}
