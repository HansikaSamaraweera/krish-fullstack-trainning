package com.hansi.training.salesmanager.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.hansi.training.salesmanager.model.Employee;
import com.hansi.training.salesmanager.repository.EmployeeRepository;
import com.hansi.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.hansi.training.salesmanager.service.EmployeeService;
import com.hansi.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.hansi")
@PropertySource("application.properties")
public class ApplicationConfiguration {

	@Bean(name = "employeeService")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
	
		return employeeService;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertyPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
 
}
