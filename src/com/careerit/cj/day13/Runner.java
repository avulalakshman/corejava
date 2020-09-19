		package com.careerit.cj.day13;

import java.util.Objects;

class A{
	private int m1(int a,int b){
		return 0;
	}
}

class B extends A{
	
	 public int m1(int a,int b){
		return 0;
	 }
	 
	 
}


class Product extends Object {
	int pid;
	String name;
	double price;

	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pid, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && pid == other.pid
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	
	
	

}

public class Runner {

	public static void main(String[] args) {

		Product p1 = new Product(1001, "Dell XPS", 59000);
		Product p2 = new Product(1002, "Lenovo Think Pad", 49000);
		Product p3 = new Product(1001, "Dell XPS", 59000);
		Product p4 = p3;
		System.out.println(p1);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p3.equals(p4));
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p1 == p3);
		System.out.println(p4 == p3);

		String name1 = new String("Krish");
		String name2 = new String("Krish");
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		

	}
}
