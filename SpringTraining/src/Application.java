import java.util.List;

import com.hansi.training.salesmanager.model.Employee;
import com.hansi.training.salesmanager.service.EmployeeService;
import com.hansi.training.salesmanager.service.EmployeeServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		List<Employee> employees = employeeService.getAllEmployees();

	
		for(Employee employee : employees) {
			System.out.println(employee.getEmployeeName() + "at" +
					employee.getEmployeeLocation());
		}
	}

}
