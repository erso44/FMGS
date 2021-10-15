import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AComponent} from "./a/a.component";
import {BComponent} from "./b/b.component";
import {AircraftStatus} from "../../guard/aircraft-status.service";

const routes: Routes = [
  {
    path: '',
    redirectTo: 'INT_A',
    pathMatch: 'full'
  },
  {
    path: 'INT_A',
    component: AComponent,
    // canActivate: [AircraftStatus.flightPhase]
  },
  {
    path: 'INT_B',
    component: BComponent,
    // canActivate: [AircraftStatus.flightPhase, AircraftStatus.engines]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: [AircraftStatus]
})
export class InitRoutingModule {
}
