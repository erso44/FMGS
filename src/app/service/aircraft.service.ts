import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AircraftService {

  private _flightPhase: string = '';
  private _engines: boolean = false;

  get flightPhase(): string {
    return this._flightPhase;
  }

  set flightPhase(value: string) {
    this._flightPhase = value;
  }


  get engines(): boolean {
    return this._engines;
  }

  set engines(value: boolean) {
    this._engines = value;
  }
}
