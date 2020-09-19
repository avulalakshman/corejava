package com.careerit.cj.day15;

public class NumberOperationsImpl implements NumberOperations {

	@Override
	public int reverse(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int sumOfDigits(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAmstrong(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int maxElement(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sumOfElements(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int factorial(int num) {
		if (num == 1 || num == 0) {
			return 1;
		}
		int res = 1;
		for (int i = 2; i <= num; i++) {
			res *= i;
		}
		return res;
	}

	@Override
	public int power(int m, int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
