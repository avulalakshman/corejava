package com.careerit.cj.day21;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

		public static void main(String[] args) {
			
				Set<Integer> set = new HashSet<>();
				
				set.add(1003);
				set.add(1001);
				set.add(1001);
				set.add(1002);
				set.add(1001);
				set.add(1002);
				set.add(null);
				set.add(null);
				set.add(1009);
				
								
				
				System.out.println(set);
				System.out.println(set.size());
				
				for(Integer ele:set) {
					System.out.println(ele);
				}
				
				
				
		}
}
