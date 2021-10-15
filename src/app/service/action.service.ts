import { Injectable } from '@angular/core';
import {BehaviorSubject, Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ActionService {

  private _action = new BehaviorSubject("");

  handle(id: string) {
    this._action.next(id);
  }

  get action(): BehaviorSubject<string> {
    return this._action;
  }
}
