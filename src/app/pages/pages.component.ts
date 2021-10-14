import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-pages',
  templateUrl: './pages.component.html',
  styleUrls: ['./pages.component.css']
})
export class PagesComponent{

  @Input('page') page: string | undefined;
  @Input('leftside') leftside: string[] | undefined;
  @Input('rightside') rightside: string[] | undefined;

}
