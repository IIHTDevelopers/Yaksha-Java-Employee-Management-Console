package com.yaksha.assessments.employee.main;


import com.yaksha.assessments.employee.business.EmployeeBusiness;

public class Main {

	EmployeeBusiness service = new EmployeeBusiness();
	static boolean ordering = true;

	public static void menu() {
		System.out.println(
				"\n\n****************Welcome To Employee Managment System *********** \n" + "\n1. View All Employees "
						+ "\n2. View Sorted Employees By Name" + "\n3. Update Employee" + "\n4. Exit\n");
	}

	public static void main(String[] args) {
		
	}

}
