package com.careerit.cj.day11;

public class Employee {

	private int empno;
	private String ename;
	private String job;
	private double salary;

	public Employee(int empno, String ename, String job, double salary) {
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
	}

	public int getEmpno() {
		return empno;
	}

	public String getEname() {
		return ename;
	}

	public String getJob() {
		return job;
	}

	public double getSalary() {
		return salary;
	}

	public void showDetails() {
		System.out.println(String.format("%d %s %s %f", empno, ename, job, salary));
	}

}
