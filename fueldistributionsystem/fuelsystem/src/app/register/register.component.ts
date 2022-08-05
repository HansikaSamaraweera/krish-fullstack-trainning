import { Component, OnInit } from '@angular/core';
import {Station} from "../model/Station";
import {Order} from "../model/Order";
import {HttpClient} from "@angular/common/http";
import {StationService} from "../service/station.service";

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  reg: Station = new Station();
  clicked:string;
  c:Station = new Station();

  constructor(private http:HttpClient, private stationService:StationService) { }

  ngOnInit(): void {
  }
  selectChangeHandler (event: any) {
    this.clicked = event.target.value;
  }
  onRegister(){
    this.c.capacity = this.clicked;
    console.log(this.reg);
    this.stationService.addstation(this.reg).subscribe((result)=>{
      if(result!=null){
        alert('Customer Added Successfully');
      }

    });
  }
}
