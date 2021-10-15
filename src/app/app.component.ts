import { Component } from '@angular/core';
import {ActionService} from "./service/action.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FMGS';

  constructor(private actionService: ActionService) {
  }

  onClick(button: HTMLButtonElement): void {
    console.log('Knopf gedrückt: ' + button.id);
    this.actionService.handle(button.id);
  }
}
