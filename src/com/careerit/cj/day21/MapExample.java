package com.careerit.cj.day21;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1001, "Tanvi");
		map.put(1002, "Naresh");
		map.put(1003, "Manoj");
		map.put(1004, "Charan");
		map.put(1001, "Tanvi A");
		map.put(1002, "Naresh A");

		Set<Integer> keys = map.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+" "+map.get(key));
		}
		
		Collection<String> values = map.values();
		
		for(String name : values) {
			System.out.println(name);
		}
		
		for(Entry<Integer, String> entrySet:map.entrySet()) {
			System.out.println(entrySet.getKey()+" "+entrySet.getValue());
		}
		
		// Java 8
		
		map.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
		
		String name = map.getOrDefault(1010, "Not available");
		map.put(1010,name);
		
	}
}
