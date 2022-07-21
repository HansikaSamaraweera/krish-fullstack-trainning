import { Employee } from './Employee.model';
import { EmployeeSearchDto } from './EmployeeSearch.dto';
import { EmployeeUpdateDto } from './EmployeeUpadate.sto';
export declare class EmployeesService {
    private employees;
    getAllEmployees(): Employee[];
    createEmployee(firstName: string, lastName: string, city: string, tier: string): Employee;
    employeeSearch(employeeSearchDto: EmployeeSearchDto): Employee[];
    getEmployeeById(id: string): Employee;
    updateEmployee(employeeUpdatedto: EmployeeUpdateDto): Employee;
    deleteEmployee(id: string): boolean;
}
