package com.careerit.cj.day6;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int rnumber = random.nextInt(6) + 1;

		for (int i = 1; i <= 3; i++) {

			System.out.println("Guess a number in range 1 - 6 only ");
			int num = sc.nextInt();

			if (num == rnumber) {
				System.out.println("Congratulation.... you guessed number in " + i + " attempts ");
				break;
			} else {
				if (i == 3) {
					System.out.println("Sorry you have reached max number of attempts");
					System.out.println("The actual number is : " + rnumber);
				} else {
					System.out.println("Sorry! try again.....");
				}
			}
		}
		sc.close();
	}
}
