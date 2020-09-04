package com.careerit.cj.day4;

import java.util.Scanner;

public class MultiplicationOfTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num value:");
		int num = sc.nextInt();
		
		for(int s=1;s<=num;s++) {
		
			for(int i=1;i<=10;i++) {
				System.out.println(s +" * "+i+" = "+(s * i));
			}
			System.out.println("---------------------");
		}
		
			
		sc.close();
	}
}
