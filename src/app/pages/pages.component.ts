import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-pages',
  templateUrl: './pages.component.html',
  styleUrls: ['./pages.component.css']
})
export class PagesComponent{

  @Input('leftside') leftside: any;
  @Input('rightside') rightside: any;

}
