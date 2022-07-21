import { EmployeesService } from './employees.service';
import { EmployeeSearchDto } from './EmployeeSearch.dto';
export declare class EmployeesController {
    private employeeService;
    constructor(employeeService: EmployeesService);
    getAllRmployee(Param: EmployeeSearchDto): import("./Employee.model").Employee[];
    createEmployee(firstName: string, lastName: string, city: string, tier: string): void;
    createEmployee2(request: any): import("./Employee.model").Employee;
}
