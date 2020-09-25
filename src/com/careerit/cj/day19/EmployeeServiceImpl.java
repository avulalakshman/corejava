package com.careerit.cj.day19;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> empList;

	public EmployeeServiceImpl() {
		empList = CsvReaderUtil.loadEmployees();
	}

	@Override
	public List<Employee> getEmployees() {
		return empList;
	}

	@Override
	public List<Employee> maxPaidEmployees() {
		List<Employee> temp = new ArrayList<Employee>();
		double max = maxSalary();
		
		for (Employee emp : empList) {
			if (emp.getSalary() == max) {
				temp.add(emp);
			}
		}
		return temp;
	}

	@Override
	public List<Employee> minPaidEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> search(String str) {
		return null;
	}

	@Override
	public int empCount() {
		return empList.size();
	}

	private double maxSalary() {
		double maxSalary = empList.get(0).getSalary();
		for (int i = 1; i < empList.size(); i++) {
			Employee emp = empList.get(i);
			if (maxSalary < emp.getSalary()) {
				maxSalary = emp.getSalary();
			}
		}
		return maxSalary;
	}

}
