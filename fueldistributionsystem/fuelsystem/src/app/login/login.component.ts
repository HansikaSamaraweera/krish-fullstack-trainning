import { Component, OnInit } from '@angular/core';
import { Station } from '../model/Station';
import {HttpClient} from "@angular/common/http";
import {StationService} from "../service/station.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  login: Station = new Station();

  constructor(private http: HttpClient, private stationService:StationService,private router:Router) {

  }

  ngOnInit(): void {
  }

  onLogin(){
    this.stationService.getByIdAndPassword(this.login.id).subscribe((result)=>{

      console.log(result);
      if(result == null){
        alert("Please enter valid id and password");

      }else{
        if(result.password == this.login.password){
          alert("successfully logged in");
          this.router.navigateByUrl('/home');
        }else{
          alert("password is incorrect")
          this.router.navigateByUrl('/login');
        }

      }
    });
  }
}
