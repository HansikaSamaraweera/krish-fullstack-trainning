import { Injectable } from '@nestjs/common';
import { randomUUID } from 'crypto';
import { identity } from 'rxjs';
import { Employee, EmployeeStatus } from './Employee.model';
import { EmployeeSearchDto } from './EmployeeSearch.dto';
import { EmployeeUpdateDto } from './EmployeeUpadate.sto';

@Injectable()
export class EmployeesService {

    private employees: Employee[] = [];
    

    getAllEmployees(){
        return this.employees;
    }
     createEmployee(firstName: string,lastName: string,city: string, tier: string){


            const employee:Employee ={
                id: randomUUID(),
                firstName,
                lastName,
                city,
                tier,
                status: EmployeeStatus.ACTIVE
            }
            this.employees.push(employee);
            return employee;
     }
     
    employeeSearch(employeeSearchDto: EmployeeSearchDto){
        
        console.log(employeeSearchDto)
        const {status,name} = employeeSearchDto;
        let employees = this.getAllEmployees();

        if(status){
            employees= employees.filter(employee => employee.status === status);

        }
        if(name){
            employees= employees.filter(employee=> employee.firstName.includes(name) || employee.lastName.includes(name));
            console.log(employees)
        }
        return employees;
           
    }   
    getEmployeeById(id:string):Employee {
        const employees= this.getAllEmployees();
        return employees.find(employee=>employee.id === id)
    }

    updateEmployee(employeeUpdatedto: EmployeeUpdateDto): Employee{
        
        const {id,city}= employeeUpdatedto;

        let employee= this.getEmployeeById(id)
        employee.city = city
        return employee;
    }

    deleteEmployee(id:string){
        let employees= this.getAllEmployees();
        this.employees=employees.filter(employee=>employee.id != id)
        return(employees.length!=this.employees.length)
    }

 }

