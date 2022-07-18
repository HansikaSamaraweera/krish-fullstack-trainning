import { Injectable } from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree} from '@angular/router';
import { Observable } from 'rxjs';
import {EmployeeComponent} from "./employee.component";

@Injectable({
  providedIn: 'root'
})
export class CreateEmployeeGuard implements CanActivate {
  constructor(private router:Router) {}
  canActivate(
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    return true;

    let depId: number = Number(route.paramMap.get("id"));

    if (depId % 2 == 0) {
      alert("not authoriezed")
      this.router.navigate({"/home"})
    }
    return true;
  }
}
