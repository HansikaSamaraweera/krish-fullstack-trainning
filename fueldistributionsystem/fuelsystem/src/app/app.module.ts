import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { GasStationComponent } from './gas-station/gas-station.component';
import { RegisterComponent } from './register/register.component';
import {RouterModule} from "@angular/router";
import { LoginComponent } from './login/login.component';
import { OrderComponent } from './order/order.component';
import { StatusComponent } from './status/status.component';
import { ReportComponent } from './report/report.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";


@NgModule({
  declarations: [
    AppComponent,
    GasStationComponent,
    RegisterComponent,
    LoginComponent,
    OrderComponent,
    StatusComponent,
    ReportComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'register', component: RegisterComponent},
      {path: 'login', component: LoginComponent},
      {path: 'home', component: GasStationComponent},
      {path: 'order', component: OrderComponent},
      {path: 'status', component: StatusComponent},
      {path: 'report', component: ReportComponent},
      {path: '', redirectTo: 'home', pathMatch: 'full'}
    ]),
    FormsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
