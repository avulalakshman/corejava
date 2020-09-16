package com.careerit.cj.day12;

import java.util.Arrays;

class Student{
	String name;
	int sem;
	public Student(String name, int sem) {
		this.name = name;
		this.sem = sem;
	}
	void showDetails() {
		System.out.println("Student name :"+name+"\nSem "+sem);
	}

}

public class PassbyValueAndReference {
	
	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		int a = 10;
		int b = 20;
		System.out.println("Before swap : a = "+a +" and b = "+b);
		swap(a,b);
		
		Student student=new Student("Krish", 5);
		student.showDetails();
		perform(student);
		student.showDetails();
		
		int[] eleArr = {0,1,2,3,4};
		System.out.println(Arrays.toString(eleArr));
		increment(eleArr);
		System.out.println(Arrays.toString(eleArr));
		
		
	}
	
	public static void increment(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i] += arr[i]+1;
		}
	}
	public static void perform(Student student) {
			student.sem +=1; 
	}

	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap  : a = "+a +" and b = "+b);
	}
}
