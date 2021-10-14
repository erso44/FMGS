import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {DirComponent} from "./pages/dir/dir.component";
import {PROGComponent} from "./pages/prog/prog.component";
import {PerfComponent} from "./pages/perf/perf.component";
import {IntComponent} from "./pages/int/int.component";

const routes: Routes = [
  {
    path: '',
    redirectTo: 'DIR',
    pathMatch: 'full'
  },
  {
    path: 'DIR',
    component: DirComponent
  },
  {
    path: 'PROG',
    component: PROGComponent
  },
  {
    path: 'PERF',
    component: PerfComponent
  },
  {
    path: 'INT',
    component: IntComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes,
    {
      enableTracing: false,
      onSameUrlNavigation: 'reload'
    })],
  exports: [RouterModule]
})
export class AppRoutingModule { }
