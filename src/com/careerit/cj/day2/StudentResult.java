package com.careerit.cj.day2;

import java.util.Scanner;

public class StudentResult {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the score:");
			
			float score = sc.nextFloat();
			
			if(score >= 40) {
				System.out.println("Congratulation : PASS");
			}else {
				System.out.println("Sorry! better luck next time : FAIL");
			}
			sc.close();
			
		}
}
