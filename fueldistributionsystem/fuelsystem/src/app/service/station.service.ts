import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Order} from "../model/Order";
import {environment} from "../../environments/environment";
import {Station} from "../model/Station";

const URL = '/station'
@Injectable({
  providedIn: 'root'
})
export class StationService{

  constructor(private http:HttpClient) {
  }

  addstation(cust: Station) {
    return this.http.post<Station>(environment.backend_url + URL + '/add',cust);
  }
  getByIdAndPassword(id: string){
    return this.http.get<Station>(environment.backend_url+ URL+'/login/'+id);
  }

}
