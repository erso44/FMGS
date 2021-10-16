import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Store} from "../model/Store";
import {Observable} from "rxjs";
import {UserService} from "./user.service";

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  HOST_PAGES = 'http://localhost:8080/api/page/'

  constructor(private http: HttpClient,
              private userService: UserService) { }

  save(page: string, element: string, value: string): Observable<Store> {
    const userUUID = this.userService.user?.uuid;
    if (!userUUID) {
      console.log('ERROR: user not found !');
    }
    const body = new Store(page, element, value, userUUID);
    return this.http.post<Store>(this.HOST_PAGES + 'store', body);
  }
}
