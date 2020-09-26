package com.careerit.cj.day19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class CsvReaderUtil {

	private CsvReaderUtil() {

	}

	public static List<Employee> loadEmployees() {
		List<Employee> empList = new ArrayList<Employee>();
		try {
			List<String> lines = Files.readAllLines(Paths.get("employee.csv"));
			empList = lines.stream().skip(1).map(line -> convertToEmployee(line)).collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return empList;
	}

	private static Employee convertToEmployee(String line) {
		String[] arr = line.split(",");
		int empno = Integer.parseInt(arr[0]);
		String ename = arr[1];
		String dept = arr[2];
		double salary = Double.parseDouble(arr[3]);
		Employee emp = new Employee();
		emp.setEmpno(empno);
		emp.setEname(ename);
		emp.setSalary(salary);
		emp.setDept(dept);
		return emp;
	}
}
