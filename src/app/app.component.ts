import {Component, OnInit} from '@angular/core';
import {ActionService} from "./service/action.service";
import {AircraftService} from "./service/aircraft.service";
import {ApiService} from "./service/api.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'FMGS';

  constructor(private actionService: ActionService,
              private apiService: ApiService,
              private aircraftService: AircraftService) {
  }

  onClick(button: HTMLButtonElement): void {
    console.log('Knopf gedrückt: ' + button.id);
    this.actionService.handle(button.id);
  }

  ngOnInit(): void {
    this.apiService.loadFlightPhase().subscribe(value => {
      this.aircraftService.flightPhase = value.information;
    });
  }
}
