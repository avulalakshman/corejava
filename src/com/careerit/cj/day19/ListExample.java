package com.careerit.cj.day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add(35);
		list.add(45);
		for (int i = 45; i <= 55; i++) {
			list.add(i);
		}
		list.add(4, 65);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(4);
		System.out.println(list);
		System.out.println(list.size());

		// For loop

		for (int i = 0; i < list.size(); i++) {
			int ele = list.get(i);
			System.out.println(ele);
		}
		
		// For each loop
		System.out.println("-------------------------- for each ---------------------------");
		for(int ele:list) {
			System.out.println(ele);
		}
		
		// Streams 
		System.out.println("---------------------------Stream-------------------------------");
		list.stream().forEach(System.out::println);
		
		
		// Iterator 
		System.out.println("-------------------------using iterator-------------------------");
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			Integer ele = itr.next();
			if(ele > 50) {
				itr.remove();
			}else {
				System.out.println(ele);
			
			}
		}
		
		System.out.println(list);
		
		//ListIterator
		System.out.println("-------------------------List iterator--------------------------");
		
		ListIterator<Integer> listItr = list.listIterator();
		
		while(listItr.hasNext()) {
			int ele = listItr.next();
			if(ele==15) {
				listItr.add(1500);
			}
			System.out.println(ele);
		}
		System.out.println(list);
		
		while(listItr.hasPrevious()) {
			int ele = listItr.previous();
			if(ele==15) {
				listItr.add(1500);
			}
			System.out.println(ele);
		}
		System.out.println(list);

	}
}
