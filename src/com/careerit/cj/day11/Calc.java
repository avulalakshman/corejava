package com.careerit.cj.day11;

import java.util.Arrays;

public class Calc {

	public int add(int a, int b) {
		System.out.println("Integer");
		return a + b;
	}

	public float add(float a, float b, float c) {
		System.out.println("Float with 3 params");
		return a + b + c;
	}

	public String add(String a, String b) {
		System.out.println("String");
		return a + b;
	}

	public float add(float a, float b) {
		System.out.println("Float");
		return a + b;
	}

	public double add(double b, double a) throws NullPointerException {
		System.out.println("Double");
		return a + b;
	}

	// Number parameters, order, type of parameters must be different
	// Access specifier - No matter
	// Return type - No matter
	// Exception - No matter

	public void incrementByOne(final int[] arr) {
			//arr = new int[]{1,2,3};
			for(int i=0;i<arr.length;i++) {
				arr[i] = ++arr[i];
			}
		
	}
	
	
	public static void main(String[] args) {

		// Type casting
		// Parsing 
		
		int empno = Integer.parseInt(args[0]);
		String name = args[1];
		double salary = Double.parseDouble(args[2]);
		
		System.out.println(String.format("%d %s %f", empno,name,salary));
		
		int a = 10;
		float b = a; 
		
		float c =  99.99f;
		int d = (int)c;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(d);
		
		String str = "15";
		int num = Integer.parseInt(str);
		
		int[] nums = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(nums));
		
		Calc obj = new Calc();
		obj.incrementByOne(nums);
		System.out.println(Arrays.toString(nums));
	}

}
