package com.careerit.cj.day2;

import java.util.Scanner;

public class ConvertToPNumber {

		public static void main(String[] args) {
				
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the age :");
			int num = sc.nextInt();
			
			if(num < 0) {
				num = -num;
			}
			
			System.out.println(num);
			sc.close();
		}
}
