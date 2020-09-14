package com.careerit.cj.day10;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Manager {

	static {
		System.out.println("----  Block -1 -------");
	}

	public static void main(String[] args) {

		System.out.println(MyMath.factorial(6));
		System.out.println(sqrt(16));
		System.out.println(PI);
		System.out.println(pow(2, 3));

	}

	static {
		System.out.println("----  Block - 2 -------");
	}
	
	public static class Inner{
		
	}
}
