import { Injectable } from '@angular/core';
import {HttpService} from "../Shared/http.service";
import {Observable} from "rxjs";
import {Employee} from "./Employee.model";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private httpService:HttpService) { }

  getEmployees():Observable<Employee[]>{
    return this.httpService.getAllEmployees();
  }
}

