package com.careerit.cj.day19;

import java.util.List;

public class Manager {

		public static void main(String[] args) {
			
				EmployeeService empService = new EmployeeServiceImpl();
				
				List<Employee> empList = empService.getEmployees();
				empList.stream().forEach(emp->{
					System.out.println(emp.getEmpno()+" "+emp.getEname()+" "+emp.getDept()+" "+emp.getSalary());
				});
				System.out.println("\nMax paid employee\n");
				empList = empService.maxPaidEmployees();
				empList.stream().forEach(emp->{
					System.out.println(emp.getEmpno()+" "+emp.getEname()+" "+emp.getDept()+" "+emp.getSalary());
				});
				
			
		}
}
