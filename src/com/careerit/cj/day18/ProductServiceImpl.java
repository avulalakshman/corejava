package com.careerit.cj.day18;

import java.util.Arrays;

public class ProductServiceImpl implements ProductService {

	private Product[] productArr;
	int count = 0;

	public ProductServiceImpl() {
		productArr = new Product[2];
	}

	@Override
	public Product addProduct(String name, double price) {

		if (count == productArr.length) {
			Product[] temp = new Product[count + 5];
			System.arraycopy(productArr, 0, temp, 0, count);
			productArr = temp;

		}
		int pid = IdGenerator.newId();
		Product product = new Product(pid, name, price);
		productArr[count++] = product;
		return product;
	}

	@Override
	public Product[] getProducts() {
		Product[] temp = new Product[count];
		for (int i = 0; i < count; i++) {
			temp[i] = productArr[i];
		}
		return temp;
	}

	@Override
	public Product updateProduct(Product product) {

		return null;
	}

	@Override
	public boolean deleteProduct(int pid) {
		if (count == 0) {
			System.out.println("There are no products to delete");

		} else {
			int index = indexOf(pid);
			if (index == -1) {
				System.out.println("Product with id:" + pid + " is not found");
			} else {
				if (index == 0) {
					Product temp[] = new Product[count - 1];
					System.arraycopy(productArr, 0, temp, 0, count - 1);
					productArr = temp;
				}

				else {
					Product temp[] = new Product[count - 1];
					System.arraycopy(productArr, 0, temp, 0, index);
					System.out.println(Arrays.toString(temp));
					System.arraycopy(productArr, index + 1, temp, index, temp.length - index);
					productArr = temp;
				}
				count--;
				return true;
			}
		}
		return false;
	}

	private int indexOf(int pid) {
		for (int i = 0; i < count; i++) {
			Product p = productArr[i];
			if (p.getPid() == pid) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public Product[] search(String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
