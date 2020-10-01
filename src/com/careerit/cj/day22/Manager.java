package com.careerit.cj.day22;

import java.util.Scanner;

public class Manager {

		public static void main(String[] args) {
				
				Quiz quiz = new Quiz();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your name:");
				String name = sc.nextLine();
				quiz.startQuiz(name);
				sc.close();
		}
}
