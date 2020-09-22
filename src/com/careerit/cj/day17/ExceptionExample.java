package com.careerit.cj.day17;

public class ExceptionExample {

	public static void main(String[] args) {
		System.out.println("Start of main method");
		try {
			int[] arr = new int[] { 2, 4, 6 };

			for (int i = 0; i <= arr.length; i++) {
				int res = arr[i] / 2;
				System.out.println(res);
			}
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception :" + e);
		} finally {
			System.out.println("Finally");
		}
		System.out.println("End of main method");
	}

}
