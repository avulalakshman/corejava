package com.careerit.cj.day16;

class Employee implements Cloneable{
	
	String name;
	double salary;
	String dept;
	
	
	
	public Employee() {
		super();
	}

	public Employee(String name, double salary,String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public void increment(double amount) {
		this.salary = this.salary + amount;
	}
	
	public void changeDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	@Override
	protected Employee clone() throws CloneNotSupportedException {
		return (Employee)super.clone();
	}
	
}

interface Shape{
		public abstract void draw();
}


public class ObjectCreations {

		public static void main(String[] args) throws CloneNotSupportedException {
			
				Employee employee = new Employee("Krish",45000,"SALES");
				employee.increment(5000);
				employee.changeDept("QA");
				System.out.println(employee);
				
				Employee emp2 = employee.clone();
				System.out.println(emp2);
				
				try {
					
					Class<?> cls = Class.forName("com.careerit.cj.day16.Employee");
					Employee emp=(Employee)cls.newInstance();
					
					System.out.println(emp);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
								
				Shape shape = new Shape() {

					@Override
					public void draw() {
						
					}
					
				};
				shape.draw();
				shape = new Shape() {
					
					@Override
					public void draw() {
						
					}
				};				
				shape.draw();
				
				
				
				
		}
}
