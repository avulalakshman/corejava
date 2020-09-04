package com.careerit.cj.day4;

import java.util.Scanner;

public class SeatAllotmentSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student count:");
		int count = sc.nextInt();
		System.out.println("Enter the no of rooms :");
		int rooms = sc.nextInt();
		System.out.println("Enter the room capacity :");
		int capacity = sc.nextInt();

		if (count <= rooms * capacity) {

			int r = count % capacity == 0 ? count / capacity : count / capacity + 1;

			int c = 1;
			for (int i = 1; i <= r; i++) {
				System.out.println("Room " + i + " Students : ");
				for (int j = 1; j <= capacity; j++) {
					System.out.print(c++ + " ");
					if (c > count)
						break;
				}
				System.out.println();
			}

		} else {
			System.out.println("Capcity is less than number of student.... please add extra room");
		}
		sc.close();

	}
}
