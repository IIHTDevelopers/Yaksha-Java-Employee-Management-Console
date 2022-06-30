package com.yaksha.assessments.testutils;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.yaksha.assessments.employee.model.Employee;

public class MasterData {

	public static Employee getEmployeeData() {
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Peter");
		employee.setAge(22);
		employee.setDepartment("IT");
		employee.setDesiganation("Developer");
		employee.setSalary(45000);
		return employee;

	}

	public static List<Employee> getEmployeeList() {
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Peter");
		employee.setAge(22);
		employee.setDepartment("IT");
		employee.setDesiganation("Developer");
		employee.setSalary(45000);
		employees.add(employee);
		employee = new Employee();
		employee.setId(102);
		employee.setName("Bob");
		employee.setAge(25);
		employee.setDepartment("IT");
		employee.setDesiganation("Test Engineer");
		employee.setSalary(57000);
		employees.add(employee);
		return employees;
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			mapper.registerModule(new JavaTimeModule());
			mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
			final String jsonContent = mapper.writeValueAsString(obj);

			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
