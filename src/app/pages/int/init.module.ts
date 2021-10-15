import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';

import {InitRoutingModule} from './init-routing.module';
import {IntComponent} from "./int.component";
import {AComponent} from "./a/a.component";
import {BComponent} from "./b/b.component";


@NgModule({
  declarations: [IntComponent, AComponent, BComponent],
  imports: [
    CommonModule,
    InitRoutingModule
  ]
})
export class InitModule {
}
