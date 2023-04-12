package com.brahma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brahma.pojo.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employeedetails")
	public Employee getEmployeeDetails() {
		
		Employee emp = new Employee();
		emp.setEid(101);
		emp.setEname("brahma");
		emp.setEsal("50000");
		return emp;
	}

}
