import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-pages',
  templateUrl: './pages.component.html',
  styleUrls: ['./pages.component.css']
})
export class PagesComponent{

  // default
  @Input('page') page: string = '';
  @Input('leftside') leftside: string[] = [];
  @Input('rightside') rightside: string[] = [];

  // PERF PAGE
  @Input('prevPage') prevPage: string = '';
  @Input('nextPage') nextPage: string = '';

}
