import { Component, OnInit } from '@angular/core';
import {Order} from "../model/Order";
import {HttpClient} from "@angular/common/http";
import {OrderService} from "../service/order.service";

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  ord: Order = new Order();
  select:string;
  c:Order = new Order();

  constructor(private http: HttpClient, private orderService:OrderService) {

  }

  ngOnInit(): void {
  }
  selectChangeHandler (event: any) {
    this.select = event.target.value;
  }

  onCreate():void{
    this.c.type = this.select;
    console.log(this.ord);
    this.orderService.addOrder(this.ord).subscribe((result)=>{
      if(result!=null){
        alert('Customer Added Successfully');
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
