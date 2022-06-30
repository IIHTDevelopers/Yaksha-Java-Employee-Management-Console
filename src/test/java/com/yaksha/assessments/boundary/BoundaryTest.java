package com.yaksha.assessments.boundary;

import static com.yaksha.assessments.testutils.TestUtils.boundaryTestFile;
import static com.yaksha.assessments.testutils.TestUtils.currentTest;
import static com.yaksha.assessments.testutils.TestUtils.testReport;
import static com.yaksha.assessments.testutils.TestUtils.yakshaAssert;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.Test;
//import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.yaksha.assessments.employee.business.EmployeeBusiness;
import com.yaksha.assessments.employee.model.Employee;

public class BoundaryTest {

	static EmployeeBusiness employeeService = null;
	static List<Employee> list = null;

	@BeforeAll
	public static void setUp() {
		employeeService = new EmployeeBusiness();
		list = employeeService.viewAllEmployees();
	}

	@AfterAll
	public static void afterAll() {
		testReport();
	}

	@Test
	public void testViewEmployeeCount() throws Exception {
		try {
			int size = list.size();
			yakshaAssert(currentTest(), size == 10, boundaryTestFile);
		}catch(Exception ex) {
			yakshaAssert(currentTest(), false, boundaryTestFile);
		}
	}
	
	

}
