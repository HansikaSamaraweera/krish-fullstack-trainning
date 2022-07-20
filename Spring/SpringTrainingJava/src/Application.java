import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hansi.training.salesmanager.model.Employee;
import com.hansi.training.salesmanager.service.EmployeeService;
import com.hansi.training.salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		 	
		EmployeeService emps = applicationContext.getBean("employeeService", EmployeeService.class);
		
		EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
		
		List<Employee> employees = employeeService.getAllEmployees();

	
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + "at" +
					employee.getEmployeeLocation());
		}
	}

}
