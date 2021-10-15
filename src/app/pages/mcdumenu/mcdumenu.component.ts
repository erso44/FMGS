import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../service/api.service";
import {ActionService} from "../../service/action.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-mcdumenu',
  templateUrl: './mcdumenu.component.html',
  styleUrls: ['./mcdumenu.component.css']
})
export class MCDUMenuComponent implements OnInit {
  page: string = '';
  menuEntriesLeft: string[][] = [];
  menuEntriesRight: string[][] = [];
  information: string = '';

  constructor(private apiService: ApiService,
              private actionService: ActionService,
              private router: Router) {
  }

  ngOnInit(): void {
    this.apiService.loadMCDUMenuPage().subscribe(value => {
      this.page = value.page;
      this.menuEntriesLeft = value.menuEntriesLeft;
      this.menuEntriesRight = value.menuEntriesRight;
      this.information = value.information;
    });
    this.subscribeToAction();
  }

  private subscribeToAction() {
    this.actionService.action.subscribe(action => {
      const leftElement = document.getElementById("left");
      if (action) {
        if (leftElement) {
          if (action === "1L") {
            this.router.navigateByUrl('/FMGC')
          } else if (action === "2L") {
            this.router.navigateByUrl('/DATA_LINK')
          } else if (action === "3L") {
            this.router.navigateByUrl('/AIDS')
          } else if (action === "4L") {
            this.router.navigateByUrl('/CFDS')
          } else if (action === "5L") {

          } else if (action === "6L") {

          }
        }
      }
    });
  }

}
