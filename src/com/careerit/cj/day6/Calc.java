package com.careerit.cj.day6;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter the num2 :");
		int num2 = sc.nextInt();

		while (true) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.Add     2.Sub    3.Mul    4.Div    5.Mod     6.Exit");
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				int res = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + res);
				break;
			case 2:
				int sub = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + sub);
				break;
			case 3:
				int mul = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + mul);
				break;
			case 4:
				int div = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + div);
				break;
			case 5:
				int mod = num1 % num2;
				System.out.println(num1 + " % " + num2 + " = " + mod);
				break;
			case 6:
				System.out.println("See you...");
				sc.close();
				System.exit(0);
			default:
				System.out.println("Please enter valid number only ( 1- 6) ");

			}
		}

	}

}
