package com.employeeDemo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employeeDemo.model.Employee;



@Repository
public interface EmployeeRepo extends MongoRepository<Employee, String>{

}
