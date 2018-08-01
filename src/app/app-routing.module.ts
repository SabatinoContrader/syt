import {LoginComponent} from './components/login/login.component';
import { NgModule } from '../../node_modules/@angular/core';
import { RouterModule, Routes } from '../../node_modules/@angular/router';

const routes: Routes = [
    {path: '', redirectTo: '/login', pathMatch: 'full'},
    {path: 'login', component: LoginComponent},
  ];

  @NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forRoot(routes, {useHash: true})]
  })
  export class AppRoutingModule {}