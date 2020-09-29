package com.careerit.cj.day21;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SetExample2 {

	public static void main(String[] args) {

		List<String> CS = Stream.of("GLN", "ALN", "NVR", "KVR").collect(Collectors.toList());
		List<String> IS = Stream.of("GLN", "MMR", "PVN", "KVR", "KCR", "BBM").collect(Collectors.toList());
		List<String> EC = Stream.of("GLN", "ALN", "DVR", "KVR", "CSR").collect(Collectors.toList());

		Set<String> names = new LinkedHashSet<>();
	
		System.out.println(names);
		
		names.addAll(CS);
		names.addAll(IS);
		names.addAll(EC);
		System.out.println(names);

		// Person who is working for CS dept only

		for (String name : CS) {
			if (!(IS.contains(name) || !EC.contains(name))) {
				System.out.println(name);
			}
		}

	}
}
