package com.careerit.cj.day7;

import java.util.Arrays;

public class ArrayQuestions {

	
	public static void main(String[] args) {
		System.out.println(getSubArray(new int[] {1, 2,3,4,5,6,7},5));
	}
	
	 // [1,2,3,4,5,6,7] n = 3 => [1,2,3] [2,3,4] [3,4,5],[4,5,6], [5,6,7]
	
	 // n=5  [1,2,3,4,5] [2,3,4,5,6],[3,4,5,6,7] => 3
	public static int getSubArray(int[] arr,int n) {
			int count = 0;
			for(int i=0;i<arr.length-n+1;i++) {
			    int k = 0;
			    int[] temp = new int[n];
				for(int j=i;j<i+n;j++) {
					temp[k++] = arr[j];
					
				}
				System.out.println(Arrays.toString(temp));
				count++;
			}
		
		return count;
	}
	
	
	// [1,2,3,4] => [3,4]
	// [1,2,3] => [3,4,5,6]

	public static boolean isSubset(int[] superArr, int[] subArr) {

		if (superArr.length < subArr.length) {
			return false;
		}

		for (int ele : subArr) {
			if (!isPresent(superArr, ele)) {
				return false;
			}
		}
		return true;
	}

	
	public static boolean isPresent(int[] arr, int key) {
		for (int ele : arr) {
			if (ele == key) {
				return true;
			}
		}
		return false;
	}
}
