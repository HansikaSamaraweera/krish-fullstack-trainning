import { Component, OnInit } from '@angular/core';
import {Order} from "../model/Order";
import {HttpClient} from "@angular/common/http";
import {OrderService} from "../service/order.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  ord: Order = new Order();
  select:string;
  c:Order = new Order();
  reference: string;

  constructor(private http: HttpClient, private orderService:OrderService, private router:Router) {

  }

  ngOnInit(): void {
  }
  selectChangeHandler (event: any) {
    this.select = event.target.value;
  }

  onCreate():void{
    this.c.type = this.select;
    console.log(this.ord);
    this.reference =  Math.random().toString(36).substr(2, 9);
    this.ord.orderId = this.reference;
    this.orderService.addOrder(this.ord).subscribe((result)=>{
      if(result!=null){
        alert('Order Placed Successfully');
        this.router.navigateByUrl('/status');
      }

    });
  }
  onOrderCreated(){
    this.http.post("http://localhost:8080/order/publish",this.ord,{responseType:'text' as 'json'})
      .subscribe((res) =>{
        console.log(res);
      });
    this.onCreate();
  }

}
