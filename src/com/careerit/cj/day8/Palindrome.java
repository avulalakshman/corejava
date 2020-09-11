package com.careerit.cj.day8;

public class Palindrome {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome("Hello"));
		System.out.println(isPalindrome("dad"));
		System.out.println(isPalindrome("12321"));
	}

	
	public static boolean isFound(String[] arr,String key) {
		
		for(String ele:arr) {
			if(ele.equals(key)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isPalindrome(String str) {

//		for (int i = 0, j = str.length() - 1; i <= j; i++, j--) {
//			if (str.charAt(i) != str.charAt(j)) {
//				return false;
//			}
//		}
//		return true;
		return new StringBuilder(str).reverse().toString().equals(str);
	}
}
