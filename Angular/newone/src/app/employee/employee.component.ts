import { Component, OnInit } from '@angular/core';
import employees from './data/employee.json';
import {Employee} from "./Employee.model";
import {EmployeeService} from "./employee.service";

@Component({
  selector: 'em-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.scss']
})
export class EmployeeComponent implements OnInit {

  title: string ='Employee Management Solution'
  employees: Employee[] = employees;
  filteredEmployees: Employee[] = employees;
  showIcon: boolean = false;
  message: string = '';
  private _designationFilter: string = ''

  set designationFilter(value:string){
    //console.log('setter fired' + value)
    this._designationFilter=value;
    this.filterByDesignation();
  }

  get designationFilter():string{
    return this._designationFilter;
  }

  constructor(private employeeService:EmployeeService) { }

  ngOnInit(): void {
    this.employeeService.getEmployees().subscribe(
      {next: data =>{
          this.filteredEmployees=data;
      this.employees=this.filteredEmployees}}
    );
  }

  toggleIcon() {
    this.showIcon = !this.showIcon;
  }

  filterByDesignation() {
    this.filteredEmployees = this.employees.filter(employees => employees.designation.includes(this.designationFilter));
  }

  onMessageReceived(value: string) {
    this.message =  value;
  }

}
