package com.careerit.cj.day6;

public class CountVowels {

	public static void main(String[] args) {

		String name = "corEJAva".toUpperCase();
		
		int vcount = 0;

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
		
			switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vcount++;
				break;

			}

		}

		System.out.println("Vowel count :" + vcount);

	}
}
