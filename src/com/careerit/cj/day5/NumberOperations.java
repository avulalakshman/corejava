package com.careerit.cj.day5;

import java.util.Scanner;

public class NumberOperations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();

		int sum = sumOfDigits(num);
		int rev = reverse(num);
		int singleDSum = sumOfDigitsUntilSingleDigitSum(num);
		System.out.println("The sum of digits of :" + num + " is " + sum);
		System.out.println("The single  digit sum of  :" + num + " is " + singleDSum);
		System.out.println("The reverse of :" + num + " is " + rev);

		if (isPalindrome(num)) {
			System.out.println("The number :" + num + " palindrome");
		} else {
			System.out.println("The number :" + num + " is not a palindrome");
		}

		if (isAmstrongNumber(num)) {
			System.out.println("The number :" + num + " is a amstrong");
		} else {
			System.out.println("The number :" + num + " is not a amstrong");
		}
		sc.close();

	}

	public static boolean isAmstrongNumber(int num) {
		int temp = num;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + r * r * r;
			temp = temp / 10;
		}

		return sum == num;
	}

	public static boolean isPalindrome(int num) {
		int rev = reverse(num);
		return rev == num;
	}

	public static int reverse(int num) {

		int rev = 0;
		while (num != 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
		}
		return rev;

	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		while (num != 0) {
			int r = num % 10;
			sum = sum + r;
			num = num / 10;
		}
		return sum;
	}

	public static int sumOfDigitsUntilSingleDigitSum(int num) {
		
		while (num > 9) {
			int sum = num % 10 + num / 10;
			num = sum;
		}
		return num;
	}
}
