import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AComponent} from "./a/a.component";
import {BComponent} from "./b/b.component";
import {FlightPhaseGuard} from "../../guard/FlightPhaseGuard";

const routes: Routes = [
  {
    path: '',
    redirectTo: 'INT_A',
    pathMatch: 'full'
  },
  {
    path: 'INT_A',
    component: AComponent,
    canActivate: [FlightPhaseGuard]
  },
  {
    path: 'INT_B',
    component: BComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
  providers: [FlightPhaseGuard]
})
export class InitRoutingModule {
}
