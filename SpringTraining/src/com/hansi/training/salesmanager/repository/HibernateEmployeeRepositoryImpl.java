package com.hansi.training.salesmanager.repository;

import java.util.ArrayList;
import java.util.List;
import com.hansi.training.salesmanager.model.*;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	@Override
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees = new ArrayList<>();
		
		Employee employee = new Employee();
		employee.setEmployeeName("Hansika");
		employee.setEmployeeLocation("Rathnapura");
		employees.add(employee);
		return employees;
		
	}

}
