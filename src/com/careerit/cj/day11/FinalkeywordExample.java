package com.careerit.cj.day11;

import java.util.Arrays;

final class MyMath{

		private final int DAYS_IN_WEEK = 7;
		public final void changeValue() {
		}
	
}




public  class FinalkeywordExample {
	
		// final keyword
	
		public final static void main(final String[] args) {
			
			final int NUM = 5;
			
			System.out.println(args.length);
			System.out.println(Arrays.toString(args));
			args[0] = "Hi";
			
			
			System.out.println(Arrays.toString(args));
		}
		
		
}
