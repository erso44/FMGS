import {Injectable} from "@angular/core";
import { CanActivate} from "@angular/router";
import {AircraftService} from "../service/aircraft.service";

@Injectable({
  providedIn: 'root'
})
export class FlightPhaseGuard implements CanActivate {

  constructor(private aircraftService: AircraftService) {
  }

  canActivate(): boolean {
    return this.aircraftService.flightPhase === 'PRE_FLIGHT';
  }

}
