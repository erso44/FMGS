import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient, HttpParams} from "@angular/common/http";
import {Display} from "../model/Display";
import {AircraftStatus} from "../model/AircraftStatus";
import {UserService} from "./user.service";

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  HOST_PAGES = 'http://localhost:8080/api/page/';

  constructor(private http: HttpClient,
              private userService: UserService) {
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
    let params = new HttpParams();
    params = params.set('uuid', this.userService.user.uuid);
    return this.http.get<Display>(this.HOST_PAGES + 'initapage', {params});
  }

  loadInitBPage(): Observable<Display> {
    return this.http.get<Display>(this.HOST_PAGES + 'initbpage');
  }

  loadFlightPhase(): Observable<AircraftStatus> {
    return this.http.get<AircraftStatus>(this.HOST_PAGES + 'aircraftStatus');
  }
}
