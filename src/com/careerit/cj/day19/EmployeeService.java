package com.careerit.cj.day19;

import java.util.List;


public interface EmployeeService {

		public List<Employee> getEmployees();
		public List<Employee> maxPaidEmployees();
		public List<Employee> minPaidEmployee();
		public List<Employee> search(String str);
		public int empCount();
}
