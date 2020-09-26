package com.careerit.cj.day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListExample {

		public static void main(String[] args) {
			
		
				String data = "Gary,Aaron,Sundhar,Gavin,Marc,Jason,Martin,Kevin,Dale,Joseph,Luke,Greg,Ben Sam,Samuel,Aidan,Blair";
				
				List<String> namesList = new ArrayList<>();
				
				String[] arr = data.split(",");
				
				
				for(String name:arr) {
					namesList.add(name);
				}
				
				// Java 8
				
				List<String> list = Arrays.asList(arr);
				System.out.println(list);
				
				//Java < 8
				for(int i=0;i<namesList.size();i++) {
					String name = namesList.get(i);
					System.out.println(name);
				}
				
				//Java 8
				System.out.println("------------------------------ Java8 ----------------------------------");
				namesList.stream().forEach(ele->System.out.println(ele));
				
				// Get me all the names, which start with letter S
				
				//Java < 8
				System.out.println("----------------------------- names starts with S---------------------");
				for(int i=0;i<namesList.size();i++) {
					String name = namesList.get(i);
					if(name.startsWith("S")) {
						System.out.println(name);
					}
				}
				
				
				// Java 8 
				System.out.println("----------------------------- Java 8 Stream filter ------------------");
				namesList
						.stream()
						.filter(ele->ele.startsWith("S"))
						.forEach(ele->System.out.println(ele));
				
				// Collect all the names, which has four characters in it
				
				// Java 7
				List<String> tempList = new ArrayList<String>();
				for(String name:namesList) {
					if(name.length() == 4) {
						tempList.add(name);
					}
				}
				System.out.println(tempList);
				
				// Java 8
				
				tempList = namesList
									.stream()
									.filter(e->e.length() == 4)
									.collect(Collectors.toList());
				
				
				System.out.println(tempList);
				
				
				// Convert all the names to upper case and store in another list
				
				List<String> upperCaseList = new ArrayList<String>();
				for(String name:namesList) {
						upperCaseList.add(name.toUpperCase());
				}
				System.out.println(upperCaseList);
				
				// Java 8
				
				List<String> upperList = namesList
												.stream()
												.map(e->e.toUpperCase())
												.collect(Collectors.toList());
				System.out.println(upperList);
				
				// Convert name list to length of name list
				
				List<Integer> nameLengthList = new ArrayList<Integer>();
				for(String name:namesList) {
						nameLengthList.add(name.length());
				}
				System.out.println(nameLengthList);
				
				// Java 8
				
				List<Integer> nameLenList = namesList.stream().map(ele->ele.length()).collect(Collectors.toList());
				System.out.println(nameLenList);
				
				// Sorting
				
				List<String> sortedList = namesList.stream()
												  .sorted(Comparator.reverseOrder())
												  .collect(Collectors.toList());
				System.out.println(sortedList);
			
				
				
			
		}
}
