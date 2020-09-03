package com.careerit.cj.day3;

import java.util.Scanner;

public class CastingVote {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dl number:");
		String dl = sc.nextLine();

		System.out.println("Enter the age :");
		int age = sc.nextInt();
		
		if(dl.length() != 0 || age > 18) {
			System.out.println("Please go and cast your vote");
		}else {
			System.out.println("Sorry! you can't cast vote");
		}
		sc.close();

	}
}
