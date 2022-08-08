import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Order} from "../model/Order";
import {environment} from "../../environments/environment";

const URL = '/dis'
@Injectable({
  providedIn: 'root'
})
export class OrderService{
  constructor(private http:HttpClient) {
  }

  getAllOrder(){
    return this.http.get<Array<Order>>(environment.backend_url+ URL+'/list/');
  }
}
