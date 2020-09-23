package com.careerit.cj.day18;

public final class IdGenerator {

		static int id = 1001;
		private IdGenerator() {
			
		}
		public static int newId() {
			return id++;
		}
}
