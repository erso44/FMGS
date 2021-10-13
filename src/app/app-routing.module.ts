import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {DirComponent} from "./pages/dir/dir.component";
import {PROGComponent} from "./pages/prog/prog.component";

const routes: Routes = [
  {
    path: '',
    redirectTo: 'DIR',
    pathMatch: 'full'
  },
  {
    path: 'DIR',
    component: DirComponent,
  },
  {
    path: 'PROG',
    component: PROGComponent
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
