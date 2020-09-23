package com.careerit.cj.day18;

import java.util.Scanner;

public class ProductManager {

	public static void main(String[] args) {

		ProductService service = new ProductServiceImpl();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("1.Add 2.Delete 3. Update 4. View All 5. Search 6. Exit");
			System.out.println("Enter your choice:");
			int ch = sc.nextInt();
			if (ch == 1) {
				sc.nextLine();
				System.out.println("Enter the product name:");
				String name = sc.nextLine();
				System.out.println("Enter the price :");
				double price = sc.nextDouble();
				Product product = service.addProduct(name, price);
				System.out.println("Product is added successfully with id:" + product.getPid());
			}else if(ch == 4) {
				Product[] products=service.getProducts();
				viewProducts(products);
			}else if(ch == 2) {
				System.out.println("Enter the id to delete");
				int pid = sc.nextInt();
				if(service.deleteProduct(pid)) {
					System.out.println("Deleted successfully");
				}
			}
		}
	}

	private static void viewProducts(Product[] products) {
		
		if(products.length == 0) {
			System.out.println("No products are added yet, please add products to see...");
		}else {
			System.out.println("----------------------- Product Details---------------------------");
			for(Product product:products) {

				System.out.println("Id    :"+product.getPid());
				System.out.println("Name  :"+product.getPname());
				System.out.println("Price :"+product.getPrice());
				System.out.println("---------------------------------------------------------------");
			}
		}
		
	}
}
