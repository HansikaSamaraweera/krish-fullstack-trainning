import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Order} from "../model/Order";
import {environment} from "../../environments/environment";

const URL = '/order'
@Injectable({
  providedIn: 'root'
})
export class OrderService{

  constructor(private http:HttpClient) {
  }

  addOrder(cust: Order) {
    return this.http.post<Order>(environment.backend_url + URL + '/add',cust);
  }

  searchByOrderId(orderId: string){
    return this.http.get<Order>(environment.backend_url+ URL+'/search/'+orderId);
  }
}
