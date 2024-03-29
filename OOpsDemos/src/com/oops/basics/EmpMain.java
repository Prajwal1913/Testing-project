package com.oops.basics;

public class EmpMain {
	public static void main(String[] args) {
		Employee employee =  new Employee();
		employee.employeeName="Raju";
		employee.employeeId=123;
		employee.salary=20000;
		System.out.println("Name "+ employee.employeeName);
		System.out.println("Id "+ employee.employeeId);
		System.out.println("Salary "+ employee.salary);
	}
}
