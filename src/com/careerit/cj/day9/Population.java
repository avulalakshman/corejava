package com.careerit.cj.day9;

public class Population {

	String countryCode;
	String country;
	double count;
	int rank;

	public Population(String countryCode, String country, double count, int rank) {
		this.countryCode = countryCode;
		this.country = country;
		this.count = count;
		this.rank = rank;
	}

	public void showInfo() {
		System.out.println("Country code     :" + countryCode);
		System.out.println("Name of country  :" + country);
		System.out.println("Population       :" + count);
		System.out.println("Rank             :" + rank);
	}

}
