package com.careerit.cj.day8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintBabyNames {

		public static void main(String[] args) throws FileNotFoundException {
			
				Scanner sc = new Scanner(new File("names.txt"));
				
				while(sc.hasNextLine()) {
					
					String data = sc.nextLine();
					String[] arr= data.split(",");
					String year = arr[0];
					String gender = arr[1].equals("B")?"BOY":"GIRL";
					String name = arr[2];
					StringBuilder sb = new StringBuilder();
					String str = sb.append(name).append("-").append(gender).append("-").append(year).toString();
					System.out.println(str);
					
					
				}
						
		}
		
		
		
		
}
