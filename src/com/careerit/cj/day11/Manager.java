package com.careerit.cj.day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Manager {

		public static void main(String[] args) throws FileNotFoundException {
			
				
				Scanner sc = new Scanner(new File("employee.csv"));
				sc.nextLine();
				
				Employee[] temp = new Employee[1000];
				int count =0;
				while(sc.hasNext()) {
					String line = sc.nextLine();
					
					String[] arr = line.split(",");
					int empno = Integer.parseInt(arr[0]);
					String ename = arr[1];
					String job = arr[2];
					double salary = Double.parseDouble(arr[3]);
					Employee emp = new Employee(empno, ename, job, salary);
					temp[count++] = emp;
				}
				
				Employee[] empArr = new Employee[count];
				for(int i=0;i<count;i++) {
					empArr[i] = temp[i];
				}
				
				showMaxPaidEmployees(empArr);
				
				
		}
		
		
		public static void showMaxPaidEmployees(final Employee[] arr) {
				double max_sal = maxSalary(arr);
				System.out.println("Max Salary is :"+max_sal+" and max paid employees :");
				for(Employee emp:arr) {
					if(emp.getSalary() == max_sal ) {
						emp.showDetails();
						System.out.println("-------------------------------------------");
					}
				}
			
		}
		
		// Tototal
		// Max
		// Min
		// Average salary
		public static void showSalStatOfEmployees(Employee[] arr) {
			
		}
		
		public static void showMinSalaryPaidEmployees() {
			
		}
		
		public static void showEmployeesOfDept(Employee[] emp, String dept) {
			
		}
		
		public static void showCountOfEmployeesInEachDept(Employee[] arr) {
			//
		}
		private static double maxSalary(Employee[] arr) {
				
					double max_sal = arr[0].getSalary();
					for(int i=1;i<arr.length;i++) {
						if(max_sal < arr[i].getSalary()) {
							max_sal = arr[i].getSalary();
						}
					}
					return max_sal;
			
		}
		
		private static double minSalary(Employee[] arr) {
			// return min salary;
			
			return 0;
		}
		
		
}
