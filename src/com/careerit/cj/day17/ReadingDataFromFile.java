package com.careerit.cj.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingDataFromFile {

	public static void main(String[] args) {
		File file = new File("names.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String str = null;
			while ((str = br.readLine()) != null) {
				String name = str.split(",")[2];
				try {
					name = name.substring(0, 5);
					System.out.println(name);
				} catch (StringIndexOutOfBoundsException e) {
					try {
						System.out.println(name + " - not have enough characters init");
					} catch (Exception ee) {
					}
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
