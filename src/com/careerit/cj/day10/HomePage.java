package com.careerit.cj.day10;

public class HomePage {

	private String title;
	private String data;
	static int count = 0;

	public HomePage(String title, String data) {
		this.title = title;
		this.data = data;
		count++;
	}

	public static void main(String[] args) {

		HomePage page1 = new HomePage("A", "AAAAA");
		HomePage page2 = new HomePage("A", "AAAAA");
		HomePage page3 = new HomePage("A", "AAAAA");
		System.out.println(HomePage.count);

	}
}
