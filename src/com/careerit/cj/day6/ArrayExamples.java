package com.careerit.cj.day6;

import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static String arrayToString(int[] arr) {
		if(arr.length == 0) {
			return "[]";
		}
		String str="[";
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length - 1) {
				str += arr[i]+", ";
			}else {
				str+=arr[i];
			}
		}
		
		str+="]";
		return str;
	}
}
