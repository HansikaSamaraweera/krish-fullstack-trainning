import { Body, Controller, Get, Param, Post, Query } from '@nestjs/common';
import { EmployeesService } from './employees.service';
import { EmployeeSearchDto } from './EmployeeSearch.dto';

@Controller('employees')
export class EmployeesController {
    constructor(private employeeService:EmployeesService){

    }
    
     @Get()
     getAllRmployee(@Query() Param:EmployeeSearchDto){
        if(Param){
            console.log('filter')
            this.employeeService.employeeSearch(Param)
        }else{
            console.log('filter')
            return this.employeeService.getAllEmployees();
    
        }


        }
     @Post()
     createEmployee(@Body('firstName')firstName: string,
     @Body('lastName')lastName: string,
     @Body('city')city: string,
     @Body('tier')tier: string){
 
        this.employeeService.createEmployee(firstName,lastName,city,tier);
     }
     @Post()
     createEmployee2(@Body() request){
         return this.employeeService.createEmployee(request.firstName,request.lastName,request.city,request.tier);
     
     }
}
