import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Display} from "../model/Display";
import {AircraftStatus} from "../model/AircraftStatus";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  HOST_PAGES = 'http://localhost:8080/api/pages';

  constructor(private http: HttpClient) {
  }

  loadDir(): Observable<Display> {
    return this.http.get<Display>(this.HOST_PAGES + 'dir');
  }

  loadPerformancePage(): Observable<Display> {
    return this.http.get<Display>(this.HOST_PAGES + 'perf');
  }

  loadMCDUMenuPage(): Observable<Display> {
    return this.http.get<Display>(this.HOST_PAGES + 'mcdumenu');
  }

  loadInitAPage(): Observable<Display> {
    return this.http.get<Display>(this.HOST_PAGES + 'initapage');
  }

  loadInitBPage(): Observable<Display> {
    return this.http.get<Display>(this.HOST_PAGES + 'initbpage');
  }

  loadFlightPhase(): Observable<AircraftStatus> {
    return this.http.get<AircraftStatus>(this.HOST_PAGES + 'aircraftStatus');
  }
}
