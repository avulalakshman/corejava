package com.careerit.cj.day8;

public class StringExample2 {

		public static void main(String[] args) {
			String name1 = "Core Java";
			String name2 = "Core Java";
			String name3 = new String("Core Java");
			String name4 = new String("Core Java");
			
			System.out.println(name1 == name2);
			System.out.println(name2 == name3);
			System.out.println(name3 == name4);
			
			System.out.println(name1.equals(name2));
			System.out.println(name2.equals(name3));
			System.out.println(name3.equals(name4));
			
		}
}
