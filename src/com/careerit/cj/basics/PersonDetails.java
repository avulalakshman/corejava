package com.careerit.cj.basics;

import java.util.Scanner;

public class PersonDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Empno,ename,salary

		System.out.println("Enter the Empno :");
		int empno = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the name :");
		String name = sc.nextLine();

		System.out.println("Enter the salary :");
		float salary = sc.nextFloat();

		
		System.out.println("Empno:" + empno);
		System.out.println("Ename:" + name);
		System.out.println("Salary:" + salary);
		sc.close();

	}
}
