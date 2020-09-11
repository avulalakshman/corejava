package com.careerit.cj.day8;

public class StringBuilderExample {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("hello");
		sb.append(" java");
		System.out.println(sb);

		String name = "Krish";
		String email = "krish@gmail.com";
		int age = 36;
		String city = "Bangalore";

		String str = new StringBuilder(name).append("-").append(email).append("-").append(age).append("-").append(city)
				.toString();
		
		
		System.out.println(str);
	}
	
	public static boolean isPalindrome(String str) {
		
		return new StringBuilder(str).reverse().toString().equals(str);
		
	}
	

}
