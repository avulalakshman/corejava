package com.careerit.cj.day18;

public interface ProductService {

	Product addProduct(String name,double price);

	Product[] getProducts();

	Product updateProduct(Product product);

	boolean deleteProduct(int pid);

	Product[] search(String str);

}
