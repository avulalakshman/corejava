package com.careerit.cj.day15;

interface One{
	public static final int NUM = 10;
	void m1();
}
interface Two extends One{
	public static final int NUM = 20;
	void m2();
	
}

class Three implements Two{

	@Override
	public void m1() {
		
	}
	
	

	@Override
	public void m2() {
		
	}
	
	public String toString() {
		return "";
	}
	

	
}


public class Runner {

}
