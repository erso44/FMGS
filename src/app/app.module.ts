import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import {RouterModule} from "@angular/router";
import {AppRoutingModule} from "./app-routing.module";
import {DirComponent} from "./pages/dir/dir.component";
import {PROGComponent} from "./pages/prog/prog.component";
import {HttpClientModule} from "@angular/common/http";
import {PerfComponent} from './pages/perf/perf.component';
import {MCDUMenuComponent} from './pages/mcdumenu/mcdumenu.component';

@NgModule({
  declarations: [
    AppComponent,
    DirComponent,
    PROGComponent,
    PerfComponent,
    MCDUMenuComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule,
    AppRoutingModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
