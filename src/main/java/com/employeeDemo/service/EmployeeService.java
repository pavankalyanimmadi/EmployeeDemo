package com.employeeDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeDemo.dao.EmployeeRepo;
import com.employeeDemo.model.Employee;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	
	public List<Employee> getAllEmployeeDetails()
	{
		return employeeRepo.findAll();
	}
	
	
	public Employee addEmployee(Employee newEmployee)
	{
		System.out.println("in service");
		System.out.println(newEmployee);
		return employeeRepo.save(newEmployee);
		
		
	}
	
	public String deleteEmployee(Employee employeeToBeDeleted)
	{
		Optional<Employee> foundEmployee=employeeRepo.findById(employeeToBeDeleted.getEmpNumber());
		
		if(foundEmployee.isPresent())
		{
			employeeRepo.delete(employeeToBeDeleted);
			return "Employee deleted successfully";
		}
		
		else
		{
			return "employee not found to delete";
		}
		
	}
	

}
