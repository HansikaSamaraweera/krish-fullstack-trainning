import { Component, OnInit } from '@angular/core';
import {Order} from "../model/Order";
import {OrderService} from "../service/order.service";
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-status',
  templateUrl: './status.component.html',
  styleUrls: ['./status.component.css']
})
export class StatusComponent implements OnInit {

  constructor(private http: HttpClient,private orderService:OrderService) { }

  od: Order= new Order();
  ans: Array<Order> = new Array
  mo : Order = new Order();
  ref:string
  showref:string

  ngOnInit(): void {
  }

  searchById(){
    this.orderService.searchByOrderId(this.mo.orderId).subscribe((result) =>{
      console.log(result);
      if(result == null){
       alert("Check the reference Id again!")
      }else{
      this.od = result;
        if(this.od!=null){
          this.showref = "Order has placed"
        }
      }
    })
  }


}
