package com.careerit.cj.day15;

class C1 {
	int a = 10;
	C1(){
		System.out.println("Constructor - c1");
	}

	void m1() {
		System.out.println("C1");
	}
}

class C2 extends C1 {
	int a = 20;
	C2(){
		System.out.println("Constructor - c2");
	}
	void m1() {
		super.m1();
		System.out.println("C2");
	}
}

class C3 extends C2 {
	int a = 30;
	C3(){
		System.out.println("Constructor - c3");
	}
	void m1() {
		super.m1();
		
		System.out.println("C3");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		
			C1 obj = new C2();
			System.out.println(obj.a);
			obj.m1();
	}
}
