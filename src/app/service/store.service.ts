import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Store} from "../model/Store";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class StoreService {

  HOST = 'http://localhost:8080/api/'

  constructor(private http: HttpClient) { }

  save(page: string, element: string, value: string): Observable<Store> {
    const body = new Store(page, element, value);
    return this.http.post<Store>(this.HOST + 'store', body);
  }
}
