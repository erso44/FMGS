import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../service/api.service";

@Component({
  selector: 'app-dir',
  templateUrl: './dir.component.html',
  styleUrls: ['./dir.component.css']
})
export class DirComponent implements OnInit {
  waypoints: string[] | undefined;
  dat: string[] | undefined;
  page: string | undefined;

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {
    this.apiService.loadDir().subscribe(value => {
      this.waypoints = value.waypoints;
      this.dat = value.dat;
      this.page= value.page;
    });
  }

}
