import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Dir} from "../model/Dir";
import {Performance} from "../model/Performance";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  HOST = 'http://localhost:8080/api/'

  constructor(private http: HttpClient) { }

  loadDir(): Observable<Dir> {
    return this.http.get<Dir>(this.HOST + 'dir');
  }

  loadPerformancePage(): Observable<Performance> {
    return this.http.get<Performance>(this.HOST + 'perf');
  }
}
