package com.yaksha.assessments.employee.business;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.yaksha.assessments.employee.exception.EmployeeNotFoundException;
import com.yaksha.assessments.employee.model.Employee;


public class EmployeeBusiness {

	List<Employee> employees = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	boolean found = false;
	int id;
	String name;
	int age;
	String department;
	String desiganation;
	double sal;

	public EmployeeBusiness() {

		addEmployees(employees);

	}

	private void addEmployees(List<Employee> employees) {
		employees.add(new Employee(101, "Shital", 24, "Developer", "IT", 25000));
		employees.add(new Employee(102, "Meena", 26, "Tester", "CO", 57000));
		employees.add(new Employee(103, "Bob", 20, "DevOps Eng", "Admin", 38000));
		employees.add(new Employee(104, "Max", 27, "System Eng", "IT", 70000));
		employees.add(new Employee(104, "Leena", 22, "Developer", "IT", 58000));
		employees.add(new Employee(104, "Mike", 32, "SysOps", "Admin", 35000));
		employees.add(new Employee(104, "Taylor", 19, "Customer Success Manager", "CSM", 56000));
		employees.add(new Employee(104, "Johny", 25, "Account Manager", "Admin", 39000));
		employees.add(new Employee(104, "Irika", 31, "Fullstack Developer", "IT", 89000));
		employees.add(new Employee(104, "Chamble", 29, "Testing Engineer", "IT", 62000));

	}

	// view all employees
	public List<Employee> viewAllEmployees() {
		return null;
	}

	public List<Employee> sortEmployeesByName() {
		return null;
	}

	// view emp based on there id
	public Employee viewEmployeeById(int id) {

		return null;
	}

	// update the employee
	public Employee updateEmployeeById(int id, double salary) {
		return null;

	}
}
