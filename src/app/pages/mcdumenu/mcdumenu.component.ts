import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../service/api.service";

@Component({
  selector: 'app-mcdumenu',
  templateUrl: './mcdumenu.component.html',
  styleUrls: ['./mcdumenu.component.css']
})
export class MCDUMenuComponent implements OnInit {
  page: string = '';
  menuEntriesLeft: string[] = [];
  menuEntryRight: string[] = [];
  information: string = '';

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {
    this.apiService.loadMCDUMenuPage().subscribe(value => {
      this.page = value.page;
      this.menuEntriesLeft = value.menuEntriesLeft;
      this.menuEntryRight.push(value.menuEntryRight);
      this.information = value.information;
    });
  }

}
