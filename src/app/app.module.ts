import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import {RouterModule} from "@angular/router";
import {AppRoutingModule} from "./app-routing.module";
import {DirComponent} from "./pages/dir/dir.component";
import {PROGComponent} from "./pages/prog/prog.component";
import {HttpClientModule} from "@angular/common/http";
import { PagesComponent } from './pages/pages.component';

@NgModule({
  declarations: [
    AppComponent,
    DirComponent,
    PROGComponent,
    PagesComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
