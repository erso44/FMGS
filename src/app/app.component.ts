import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'FMGS';

  onClick(button: HTMLButtonElement): void {
    console.log('Knopf gedrückt: ' + button.id);
  }
}
