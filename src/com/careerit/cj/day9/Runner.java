package com.careerit.cj.day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {

		Population[] popArray = getPopulationData();
		System.out.println("Total countries found :" + popArray.length);

		// Show only country code and country name

		for (Population obj : popArray) {
			System.out.println(obj.countryCode + " " + obj.country);
		}

		// Min population country

		double min_population = popArray[0].count;
		for (Population obj : popArray) {
			if (obj.count < min_population) {
				min_population = obj.count;
			}
		}

		System.out.println("Min population is :" + min_population);
		for (Population obj : popArray) {
			if (obj.count == min_population) {
				obj.showInfo();
			}
		}
		// Display top 10 populated countries 
		
		System.out.println("Top 10 Populated countries :");
		
		for(Population obj : popArray) {
			if(obj.rank <= 10) {
				obj.showInfo();
			}
		}

	}

	private static Population[] getPopulationData() {
		Population[] popArray = new Population[232];
		int i = 0;
		try {
			Scanner sc = new Scanner(new File("population.txt"));
			sc.nextLine();// Skip headings
			while (sc.hasNextLine()) {
				int c = 0;
				String[] dataArr = sc.nextLine().split(",");
				String countryCode = dataArr[c++];
				String country = dataArr[c++];
				double count = Double.parseDouble(dataArr[c++]);
				int rank = Integer.parseInt(dataArr[c++]);

				Population obj = new Population(countryCode, country, count, rank);
				popArray[i++] = obj;
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return popArray;
	}
}
