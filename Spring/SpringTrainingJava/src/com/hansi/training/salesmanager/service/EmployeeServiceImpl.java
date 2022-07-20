package com.hansi.training.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hansi.training.salesmanager.model.Employee;
import com.hansi.training.salesmanager.repository.EmployeeRepository;
import com.hansi.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

 
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl() {
		System.out.println("default");
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		System.out.println("overloaded");
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}


	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("sertter execute");
		this.employeeRepository = employeeRepository;
	}
	
	

}
