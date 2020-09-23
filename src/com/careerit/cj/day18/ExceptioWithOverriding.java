package com.careerit.cj.day18;

import java.io.FileNotFoundException;

class OneException extends Exception{
	
}
class TwoException extends OneException{
	
}

class ThreeException extends TwoException{
	
}

class One{
	public void m1()throws TwoException {
		
	}
}

class Two extends One{
	@Override
	public void m1(){
		
	}
	
}

public class ExceptioWithOverriding {

		public static void main(String[] args) {
			
		}
}
