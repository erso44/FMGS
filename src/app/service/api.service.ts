import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Display} from "../model/Display";
import {AircraftStatus} from "../model/AircraftStatus";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  HOST = 'http://localhost:8080/api/'

  constructor(private http: HttpClient) {
  }

  loadDir(): Observable<Display> {
    return this.http.get<Display>(this.HOST + 'dir');
  }

  loadPerformancePage(): Observable<Display> {
    return this.http.get<Display>(this.HOST + 'perf');
  }

  loadMCDUMenuPage(): Observable<Display> {
    return this.http.get<Display>(this.HOST + 'mcdumenu');
  }

  loadInitAPage(): Observable<Display> {
    return this.http.get<Display>(this.HOST + 'initapage');
  }

  loadInitBPage(): Observable<Display> {
    return this.http.get<Display>(this.HOST + 'initbpage');
  }

  loadFlightPhase(): Observable<AircraftStatus> {
    return this.http.get<AircraftStatus>(this.HOST + 'aircraftStatus');
  }
}
