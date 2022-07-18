import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http'
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { LkrformatterPipe } from './Shared/lkrformatter.pipe';
import { ProgressBarComponent } from "./src/app/Shared/progress-bar/progress-bar.component";
import { HomeComponent } from './home/home.component';
import {FormsModule} from "@angular/forms";
import {RouterModule} from "@angular/router";
import {CreateEmployeeGuard} from "./employee/create-employee.guard";


@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    LkrformatterPipe,
    ProgressBarComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      { path: 'employee', component: EmployeeComponent},
      { path: 'employee/:id', component: EmployeeComponent, canActivate:[CreateEmployeeGuard]},
      {path:'home', component: HomeComponent},
      {path:'', redirectTo: 'home',pathMatch: 'full'}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
