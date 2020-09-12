package com.careerit.cj.day9;

public class Person {

	String name;
	int age;
	double height;

	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void incrementAge() {
		age++;
	}

	public void showInfo() {
		System.out.println("Name   :" + name);
		System.out.println("Age    :" + age);
		System.out.println("Height :" + height);
	}

}
