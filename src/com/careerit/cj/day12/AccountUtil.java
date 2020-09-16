package com.careerit.cj.day12;

public final class AccountUtil {

		private AccountUtil() {
		}
		
		public static String maskAccountNumber(String accNumber) {
			return "XXXXXX"+accNumber.substring(6);
		}
}
