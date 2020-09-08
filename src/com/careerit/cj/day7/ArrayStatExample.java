package com.careerit.cj.day7;

import java.util.Arrays;
import java.util.Random;

public class ArrayStatExample {

	public static void main(String[] args) {
		
			int arr[] = getRandomArray();
			
		
			System.out.println(Arrays.toString(arr));
			int max = arr[0];
			int min = arr[0];
			int sum = 0;
			for(int i=1;i<arr.length;i++) {
				int ele = arr[i];
				if(max < ele) {
					max = ele;
				}
				if(min > ele) {
					min = ele;
				}
				sum +=ele;
			}
			
			float avg = sum / (float)arr.length;
			
			System.out.println("Max  Value :"+max);
			System.out.println("Min  Value :"+min);
			System.out.println("Sum is     :"+sum);
			System.out.println("Avg is     :"+avg);
			
		
		
	}

	
	public static int[] getRandomArray() {

		int[] arr = new int[20];

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(500) + 1;
		}
		return arr;

	}
}
