package com.careerit.cj.day7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = getRandomArray();

		System.out.println("Enter the number to search:");
		int ele = sc.nextInt();

		boolean isPresent = false;
		
			
		for(int i : arr) {
			if (i == ele) {
				isPresent = true;
				break;
			}
		}
		
		if (isPresent) {
			System.out.println("Element :" + ele + " is present in :" + Arrays.toString(arr));
		} else {
			System.out.println("Element :" + ele + " is not found :" + Arrays.toString(arr));
		}
		
		System.out.println("The element :"+ele+" is occured in :"+Arrays.toString(arr)+" : "+occurance(arr, ele)+"  times ");
		sc.close();

	}

	public static int occurance(int[] arr, int key) {
		int count = 0;
		for (int ele : arr) {
			if (ele == key) {
				count++;
			}
		}
		return count;

	}

	public static int[] getRandomArray() {

		int[] arr = new int[25];

		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10) + 1;
		}
		return arr;

	}

}
