import {Injectable} from "@angular/core";
import {CanActivate} from "@angular/router";
import {AircraftService} from "../service/aircraft.service";

@Injectable({
  providedIn: 'root'
})
export class AircraftStatus {

  // TODO multiple guards not working

  static flightPhase = class FlightPhase implements CanActivate {
    constructor(private aircraftService: AircraftService) {
    }
    canActivate(): boolean {
      return this.aircraftService.flightPhase === 'PRE_FLIGHT';
    }
  }

  static engines = class Engines implements CanActivate {
    constructor(private aircraftService: AircraftService) {
    }
    canActivate(): boolean {
      return !this.aircraftService.engines;
    }
  }

}
