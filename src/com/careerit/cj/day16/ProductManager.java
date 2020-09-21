package com.careerit.cj.day16;

class Product{

		private int pid;
		private String pname;
		private double price;
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		
		
}

public class ProductManager{
	
	public static void main(String[] args) {
		
			Product product1 = new Product();
			product1.setPid(1001);
			product1.setPname("AirBook");
			product1.setPrice(55000);
			
			Product product2 = new Product();
			product2.setPid(1002);
			product2.setPname("Lenovo Thinkpad");
			product2.setPrice(45000);
			
			Product product3 = new Product();
			product3.setPid(1003);
			product3.setPname("XPS");
			product3.setPrice(65000);
			
			
			Product[] parr = new Product[] {product1,product2,product3};
			
			for(Product p:parr) {
				System.out.println(p.getPname());
			}
			
			
	}
}
