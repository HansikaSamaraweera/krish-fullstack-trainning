package com.hansi.training.salesmanager.repository;

import java.util.List;

import com.hansi.training.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}