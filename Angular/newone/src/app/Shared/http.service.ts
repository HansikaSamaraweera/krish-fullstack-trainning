import {Injectable} from "@angular/core";
import {HttpClientModule} from "@angular/common/http";
import {Observable} from "rxjs";
import {Employee} from "../employee/Employee.model";

@Injectable({
  providedIn:"root"
})
export class HttpService{
  private employeeUrl:string='http://localhost:3020/employees'

  constructor(private http:HttpClientModule) {
  }

  getAllEmployees():Observable<Employee[]>{
    return this.http.get<Employee[]>(this.employeeUrl);
  }
}
