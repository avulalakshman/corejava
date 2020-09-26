package com.careerit.cj.day19;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

	@Override
	public List<Employee> sortByName() {
		return empList.stream().sorted(Comparator.comparing(Employee::getEname)).collect(Collectors.toList());
	}

	@Override
	public double totalSalary() {
//		double tsal = 0;
//		for (Employee emp : empList) {
//			tsal += emp.getSalary();
//		}
//		return tsal;
		return empList.stream().mapToDouble(e -> e.getSalary()).sum();
	}

	@Override
	public List<String> getEmployeeNames() {
//		List<String> namesList = new ArrayList<String>();
//		for(Employee emp:empList) {
//			namesList.add(emp.getEname());
//		}
//		return namesList;

		return empList.stream().map(e -> e.getEname()).collect(Collectors.toList());

	}

	@Override
	public List<Employee> getEmployeeByDept(String dept) {
		return empList.stream().filter(e -> e.getDept().equalsIgnoreCase(dept)).collect(Collectors.toList());
	}

	@Override
	public double totalSalaryByDept(String dept) {
		return empList.stream().filter(e -> e.getDept().equalsIgnoreCase(dept)).mapToDouble(e -> e.getSalary()).sum();
	}

}
