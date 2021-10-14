import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../service/api.service";

@Component({
  selector: 'app-perf',
  templateUrl: './perf.component.html',
  styleUrls: ['./perf.component.css']
})
export class PerfComponent implements OnInit {
  rightside: string[] = [];
  leftside: string[] = [];
  page: string = '';
  prevPage: string = '';
  nextPage: string = '';

  constructor(private apiService: ApiService) { }

  ngOnInit(): void {
    this.apiService.loadPerformancePage().subscribe(value => {
      this.page = value.page;
      this.prevPage = value.prevPage;
      this.nextPage = value.nextPage;
    });
  }

}
