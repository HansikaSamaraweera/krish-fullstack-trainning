import { Component, OnInit } from '@angular/core';
import {OrderService} from "../service/Order.service";
import {Order} from "../model/Order";

@Component({
  selector: 'app-orderlist',
  templateUrl: './orderlist.component.html',
  styleUrls: ['./orderlist.component.css']
})
export class OrderlistComponent implements OnInit {

  constructor(private orderService:OrderService) { }

  list: Array<Order> = new Array<Order>();

  ngOnInit(): void {

  }

  getAllOrder(){
    this.orderService.getAllOrder().subscribe((result) =>{
      this.list = result;
    })
  }

}
