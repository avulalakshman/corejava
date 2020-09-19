package com.careerit.cj.day15;

public class Manager {

		public static void main(String[] args) {
			NumberOperations obj = new NumberOperationsImpl();
			
			int num = 6;
			int res = obj.factorial(num);
			System.out.println("Factorial of num :"+num +" is "+res);
			
			
		}
}
