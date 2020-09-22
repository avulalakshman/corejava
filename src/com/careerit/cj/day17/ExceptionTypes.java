package com.careerit.cj.day17;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.WrongMethodTypeException;

public class ExceptionTypes {

	public static void main(String[] args) {

		Throwable[] arr = getAllErrorAndEceptions();
		
		// Can you tell how many checked, unchecked and error object count
		
		int re = 0;
		int ce = 0;
		int er = 0;
		for(Throwable obj : arr) {
			if(obj instanceof RuntimeException) {
				re++;
			}else if(obj instanceof Exception) {
				ce++;
			}else {
				System.out.println(obj);
				er++;
			}
		}
		
		System.out.println(re+" "+ce+" "+er);
			
	}
	private static Throwable[] getAllErrorAndEceptions() {
		return new Throwable[] { new IllegalAccessError(), new OutOfMemoryError(), new NullPointerException(),
				new NumberFormatException(), new IOException(), new FileNotFoundException() ,new WrongMethodTypeException(),new ClassCastException()};
	}
}
