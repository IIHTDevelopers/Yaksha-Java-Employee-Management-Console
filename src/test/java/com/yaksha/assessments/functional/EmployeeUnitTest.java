package com.yaksha.assessments.functional;


import static com.yaksha.assessments.testutils.TestUtils.businessTestFile;
import static com.yaksha.assessments.testutils.TestUtils.currentTest;
import static com.yaksha.assessments.testutils.TestUtils.testReport;
import static com.yaksha.assessments.testutils.TestUtils.yakshaAssert;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.yaksha.assessments.employee.business.EmployeeBusiness;
import com.yaksha.assessments.employee.model.Employee;
import com.yaksha.assessments.testutils.MasterData;

class EmployeeUnitTest {

	static EmployeeBusiness employeeBusiness = null;
	static List<Employee> list = null;

	@BeforeAll
	public static void setUp() {
		employeeBusiness = new EmployeeBusiness();
		list = employeeBusiness.viewAllEmployees();
	}

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testViewAllEmployees() throws IOException {
		try {
			yakshaAssert(currentTest(), list.size() == 10 ? true : false, businessTestFile);
		}catch(Exception ex) {
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}

	@Test
	public void testUpdateEmployeeById() throws IOException {
		Employee employee = MasterData.getEmployeeData();
		try {
			Employee emp = employeeBusiness.updateEmployeeById(employee.getId(), 99999);
			yakshaAssert(currentTest(), employee.getSalary() != emp.getSalary() ? true : false, businessTestFile);
		}catch(Exception ex) {
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}

	@Test
	public void testEmployeeSortByName() throws IOException {
		List<Employee> sortedEmployee = employeeBusiness.sortEmployeesByName();
		try {
			yakshaAssert(currentTest(), sortedEmployee.get(0).getName().equalsIgnoreCase("Bob") ? true : false,
				businessTestFile);
		}catch(Exception ex) {
			yakshaAssert(currentTest(), false, businessTestFile);
		}	
	}

	@Test
	public void testViewEmployeeById() throws IOException {
		Employee emp = employeeBusiness.viewEmployeeById(101);
		try {
			yakshaAssert(currentTest(), emp.getName().equalsIgnoreCase("Shital") ? true : false, businessTestFile);
		}catch(Exception ex) {
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}

}
