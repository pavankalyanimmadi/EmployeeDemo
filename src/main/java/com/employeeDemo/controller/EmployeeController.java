package com.employeeDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeeDemo.model.Employee;
import com.employeeDemo.service.EmployeeService;

@RestController
@CrossOrigin("*")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeService;
	
	
	@GetMapping("/")
	public String welcome()
	{
		return "========Welcome to Employee Portal==========";
		
	}
	
	
	
	@GetMapping("/getall")
	public List<Employee> getAllEmployeeDetail()
	{
		return employeService.getAllEmployeeDetails();
	}
	
	
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee newEmp)
	{
		System.out.println("in controller");
		System.out.println(newEmp);
		return employeService.addEmployee(newEmp);
		
	}
	
	
	
	@PostMapping("/deleteemployee")
	public String deleteEmployee(@RequestBody Employee emp)
	{
		return employeService.deleteEmployee(emp);
		
	}

}
