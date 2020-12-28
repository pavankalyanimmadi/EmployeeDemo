package com.employeeDemo.model;

import org.springframework.data.annotation.Id;



public class Employee {
	
	@Id
	private String empNumber;
	
	private String empName;
	private String empMailId;
	public String getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpMailId() {
		return empMailId;
	}
	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", empName=" + empName + ", empMailId=" + empMailId + "]";
	}
	
	
	
	
	

	
	
	
	
	
	
	
	

}
