package com.careerit.cj.day10;

public class Student {

	static String cname = "CareerIT";
	int usn;
	String name;
	int sem;

	public Student(int usn, String name, int sem) {
		this.usn = usn;
		this.name = name;
		this.sem = sem;
	}

	public void showInfo() {
		System.out.println("Name:" + name);
		System.out.println("Usn :" + usn);
		System.out.println("Sem :" + sem);
	}
}
