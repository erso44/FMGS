import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../../service/api.service";
import {ActionService} from "../../../service/action.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-a',
  templateUrl: './a.component.html',
  styleUrls: ['./a.component.css']
})
export class AComponent implements OnInit {

  page: string = '';
  menuEntriesLeft: string[][] = [];
  menuEntriesRight: string[][] = [];

  constructor(private apiService: ApiService,
              private actionService: ActionService,
              private router: Router) { }

  ngOnInit(): void {
    this.apiService.loadInitAPage().subscribe(value => {
      this.page = value.page;
      this.menuEntriesLeft = value.menuEntriesLeft;
      this.menuEntriesRight = value.menuEntriesRight;
    });
    this.subscribeToAction();
  }

  private subscribeToAction() {
    this.actionService.action.subscribe(action => {
      const leftElement = document.getElementById("left");
      if (action) {
        if (leftElement) {
          if (action === "1L") {

          } else if (action === "2L") {

          } else if (action === "3L") {

          } else if (action === "4L") {

          } else if (action === "5L") {

          } else if (action === "6L") {

          }
        }
        if (action === "17M") {
          this.router.navigateByUrl('/INT/INT_B');
        }
      }
    });
  }

}
