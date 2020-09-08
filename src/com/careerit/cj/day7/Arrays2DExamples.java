package com.careerit.cj.day7;

public class Arrays2DExamples {

	public static void main(String[] args) {

		int[][] arr = new int[][] {
				{ 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 1 }, 
				{ 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 1 },
				{ 1, 0, 0, 0, 1 }, 
				{ 1, 0, 0, 0, 1 }

		};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				int ele = arr[i][j];
				if(ele == 1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}
	
	public static int sumElements(int[][] arr) {
		return 0;
	}
	
	public static int getMaxSumRowNumber(int[][] arr) {
		return -1;
	}
	
	public static int diagonalSum(int[][] arr) {
		return 0;
	}
	
	public static int diagonalSumDifference(int[][] arr) {
		return 0;
	}
	
	public static int[] sortElements(int[] arr) {
		
		return null;
	}
	// If all elements are present it should return true otherwise should return false
	public static boolean isFound(int[] arr,int a,int b,int c) {
		return false;
	}
	
}
