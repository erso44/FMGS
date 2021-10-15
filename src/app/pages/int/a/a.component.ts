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
  store: string = '';

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
      const rightElement = document.getElementById("right");
      if (action) {
        if (leftElement) {
          if (action === "1L") {
            if (this.store) {
              this.menuEntriesLeft[0][1] = this.store;
              this.clearStore();
            }
          } else if (action === "2L") {
            if (this.store) {
              this.menuEntriesLeft[1][1] = this.store;
              this.clearStore();
            }
          } else if (action === "3L") {
            if (this.store) {
              this.menuEntriesLeft[2][1] = this.store;
              this.clearStore();
            }
          } else if (action === "4L") {
            if (this.store) {
              this.menuEntriesLeft[3][1] = this.store;
              this.clearStore();
            }
          } else if (action === "5L") {
            if (this.store) {
              this.menuEntriesLeft[4][1] = this.store;
              this.clearStore();
            }
          } else if (action === "6L") {
            if (this.store) {
              this.menuEntriesLeft[5][1] = this.store;
              this.clearStore();
            }
          }
        }
        if (rightElement) {
          if (action === "1R") {

          } else if (action === "2R") {

          } else if (action === "3R") {

          } else if (action === "4R") {

          } else if (action === "5R") {

          } else if (action === "6R") {
            this.router.navigateByUrl('/INT/INT_B');
          }
        }
        if (action === "17M") {
          this.router.navigateByUrl('/INT/INT_B');
        }
        if (action == "1") {
          this.store = this.store + action;
        } else if (action === "2") {
          this.store = this.store + action;
        } else if (action === "3") {
          this.store = this.store + action;
        } else if (action === "4") {
          this.store = this.store + action;
        } else if (action === "5") {
          this.store = this.store + action;
        } else if (action === "6") {
          this.store = this.store + action;
        } else if (action === "7") {
          this.store = this.store + action;
        } else if (action === "8") {
          this.store = this.store + action;
        } else if (action === "9") {
          this.store = this.store + action;
        } else if (action === "0") {
          this.store = this.store + action;
        } else if (action === "Point") {
          this.store = this.store + ".";
        } else if (action === "PlusMinus") {
          this.store = this.store + action;
        } else if (action === "Clear") {
          this.store = this.store.substring(0, this.store.length - 1);
        }
      }
    });
  }

  clearStore(): void {
    this.store = '';
  }

}
