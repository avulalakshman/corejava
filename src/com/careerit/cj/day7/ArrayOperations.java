package com.careerit.cj.day7;

public class ArrayOperations {
	
			public static void main(String[] args) {
				
					int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
					
					System.out.println("**************************");
					for(int i=arr.length-1;i>=0;i--) {
						int ele = arr[i];
						System.out.println(ele);
					}
					System.out.println("**************************");
					for(int i=0;i<arr.length;i++) {
						int ele = arr[i];
						System.out.println(ele);
					}
					System.out.println("**************************");
					
					for(int ele : arr) {
						System.out.println(ele);
					}
			}
}
