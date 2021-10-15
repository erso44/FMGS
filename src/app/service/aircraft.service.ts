import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AircraftService {

  private _flightPhase: string = '';

  constructor() { }


  get flightPhase(): string {
    return this._flightPhase;
  }

  set flightPhase(value: string) {
    this._flightPhase = value;
  }
}
