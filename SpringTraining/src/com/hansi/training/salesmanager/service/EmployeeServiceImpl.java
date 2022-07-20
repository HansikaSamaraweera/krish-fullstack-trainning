package com.hansi.training.salesmanager.service;

import java.util.List;

import com.hansi.training.salesmanager.model.Employee;
import com.hansi.training.salesmanager.repository.EmployeeRepository;
import com.hansi.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}

}
