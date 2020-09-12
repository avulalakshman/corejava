package com.careerit.cj.day9;

public class Manager {

	public static void main(String[] args) {

		Person obj1 = new Person("Krish", 36, 5.2);
		Person obj2 = new Person("Sai", 32, 5.8);
		Person obj3 = new Person("Manoj", 38, 5.9);
		Person obj7 = new Person("Charan", 32, 5.8);
		Person obj4 = new Person("Ram", 38, 5.9);
		Person obj5 = new Person("John", 32, 4.8);
		Person obj6 = new Person("Sanju", 38, 6.1);

		Person[] persons = { obj1, obj2, obj3, obj4, obj5, obj6, obj7 };

		for (Person person : persons) {
			person.showInfo();
			System.out.println("***************************");
		}

		double min_height = persons[0].height;
		double max_height = persons[0].height;

		for (Person person : persons) {
			double height = person.height;
			if (height < min_height) {
				min_height = height;
			}

			if (height > max_height) {
				max_height = height;
			}

		}

		System.out.println("Max height:" + max_height + " and max height persons: ");

		for (Person person : persons) {
			if (max_height == person.height) {
				person.showInfo();
			}
		}

		System.out.println("Min height:" + min_height + " and min height persons: ");

		for (Person person : persons) {
			if (min_height == person.height) {
				person.showInfo();
			}
		}

	}
}
