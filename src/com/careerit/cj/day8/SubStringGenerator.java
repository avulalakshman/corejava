package com.careerit.cj.day8;

public class SubStringGenerator {

	public static void main(String[] args) {
			subStringOfGivenSize("RAJESH", 3);
	}
	
	
	// RAJESH n = 4 [RAJE, AJES, JESH]
	public static void subStringOfGivenSize(String str, int n) {
	
		for(int i=0;i<str.length()-n+1;i++) {
			System.out.println(str.substring(i, i+n));
		}
	}
}
