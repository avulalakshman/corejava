package com.careerit.cj.day21;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Product {

	private String pname;
	private double price;

	public Product(String pname, double price) {
		super();	
		this.pname = pname;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pname=" + pname + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(pname, price);
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
		return Objects.equals(pname, other.pname)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

}

public class ProductManager {

	public static void main(String[] args) {
		Set<Product> products = new HashSet<>();
		Product p1 = new Product("Dell", 45000);
		Product p2 = new Product("Dell", 45000);
		Product p3 = new Product("Lenovo", 55000);
		Product p4 = new Product("Lenovo Thinkpad", 55000);
		Product p5 = new Product("Lenovo", 55000);

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);

		System.out.println(products.size());

	}
}
