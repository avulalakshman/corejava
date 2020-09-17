package com.careerit.cj.day13;

class One {
	int a = 10;

	void m1() {
		System.out.println("M1");
	}

}

class Two extends One {
	int a = 20;

	void m1() {
		System.out.println("Two M1");
	}

	void m2() {
		System.out.println("M2");
	}
}

class Three extends Two {
	int a = 30;

	void m1() {
		System.out.println("Three M1");
	}

	void m3() {
		System.out.println("Three m3");
	}
}

public class Manager {

	public static void main(String[] args) {

		One obj = getInstance();

		if (obj instanceof Three) {
			Three t3 = (Three) obj;
			t3.m1();
			t3.m2();
			t3.m3();
		} else if (obj instanceof Two) {
			Two t2 = (Two) obj;
			t2.m1();
			t2.m2();
		} else {
			obj.m1();
		}

	}

	private static One getInstance() {

		return new Three();
	}
}
