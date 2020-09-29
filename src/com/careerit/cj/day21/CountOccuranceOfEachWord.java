package com.careerit.cj.day21;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfEachWord {

	public static void main(String[] args) {
		String str = "GLN,ALN,MVR,KVR,GVR,NVR,ALN,MVR,KVR,GVR,NVR,BABU,BALU,MANOJ,CHARAN,CHARAN,KRISH,JOHN,JONY,TOMY,KVR,RRR,KVR,GVR,NVR,BABU,BALU,MANOJ,CHARAN,CHARAN,KRISH,JOHN";

		String[] arr = str.split(",");

		Map<String, Integer> map = new HashMap<>();

		for (String name : arr) {
			int count = map.getOrDefault(name, 0) + 1;
			map.put(name, count);
		}

		System.out.println(map);
	}
}
