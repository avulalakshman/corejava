package com.careerit.cj.day17;

import java.util.Scanner;

public class ExcpetionDemo {

	public static void main(String[] args) {
		System.out.println("Start of Main");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b = sc.nextInt();
		try {
			int res = a / b;
			System.out.println("Result :" + res);
		} catch (ArithmeticException e) {
			System.out.println("B value can't zero");
			e.printStackTrace();
		}
		System.out.println("End of Main");
		sc.close();
		try {
			int result = retRes(10, 0);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static int retRes(int a, int b) {
		return div(product(sum(a, b), sub(a, b)), product(a, b));
	}

	private static int div(int a, int b) {
		return a / b;
	}

	private static int product(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static int sub(int a, int b) {
		return a - b;
	}
}
