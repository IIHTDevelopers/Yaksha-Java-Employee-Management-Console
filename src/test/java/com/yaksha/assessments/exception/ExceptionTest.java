package com.yaksha.assessments.exception;


import static com.yaksha.assessments.testutils.TestUtils.exceptionTestFile;
import static com.yaksha.assessments.testutils.TestUtils.currentTest;
import static com.yaksha.assessments.testutils.TestUtils.testReport;
import static com.yaksha.assessments.testutils.TestUtils.yakshaAssert;
import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.yaksha.assessments.employee.business.EmployeeBusiness;
import com.yaksha.assessments.employee.exception.EmployeeNotFoundException;
import com.yaksha.assessments.employee.model.Employee;


class ExceptionTest {

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
	public void testEmployeeDoesNotExistsException() throws IOException {
		try {
			employeeBusiness.viewEmployeeById(999);
			yakshaAssert(currentTest(), false, exceptionTestFile);
		}catch(EmployeeNotFoundException ex) {
			yakshaAssert(currentTest(), true, exceptionTestFile);
		}
		catch(Exception ex) {
			yakshaAssert(currentTest(), false, exceptionTestFile);
		}
		
	}

}
