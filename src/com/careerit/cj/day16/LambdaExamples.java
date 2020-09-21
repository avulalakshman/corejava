package com.careerit.cj.day16;

@FunctionalInterface
interface MathOpe {
	public int perform(int a, int b);
	default void message() {
		System.out.println("Hello");
	}
}


public class LambdaExamples {

	public static void main(String[] args) {

		MathOpe obj1 = (a, b) -> a + b;
		MathOpe obj2 = (a, b) -> a * b;
		MathOpe obj3 = (a, b) -> a / b;

		System.out.println(obj1.perform(10, 20));
		System.out.println(obj2.perform(10, 20));
		System.out.println(obj3.perform(20, 10));
	}
}
