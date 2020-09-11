package com.careerit.cj.day8;

public class StringClassMethods {

	public static void main(String[] args) {

		String name = "Krish";
		int age = 36;
		double salary = 980000;

		String data = name.concat("-" + age).concat("-" + salary);

		String names = "Krish,Manoj,Suresh,Rajesh,Ramesh,Mahesh,Jayesh,Kiran,Charan";

		String[] arr = names.split(",");
		for (String ele : arr) {
			System.out.println(ele.toLowerCase());
		}

		String str = "RAMESH";

		System.out.println(str.trim().length());
		System.out.println(str.length());

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		// Print only first 3 characters of all names
		
		for(String ele:arr) {
			System.out.println(ele.substring(0, 3).toUpperCase());
		}
		
		String usndata="10X05MCA36,10X05CSE34,10X05ISE35,10X05ECE37,10X05EEE36,10X05CSE39";
		
		String[] usns=usndata.split(",");
		
		for(String usn:usns) {
			System.out.println(usn.substring(5, 8));
		}
		
		String st = "Hello how are you";
		st = st.substring(5, 9).trim().toUpperCase().substring(0,2);
		System.out.println(st);
		

	}
}
