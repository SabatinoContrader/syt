import {LoginComponent} from './components/login/login.component';
import { NgModule } from '../../node_modules/@angular/core';
import { RouterModule, Routes } from '../../node_modules/@angular/router';
import { HomeGiudiceComponent } from './components/home-giudice/home-giudice.component';
import { HomeCantanteComponent } from './components/home-cantante/home-cantante.component';

const routes: Routes = [
    {path: '', redirectTo: '/login', pathMatch: 'full'},
    {path: 'login', component: LoginComponent},
    {path: 'homeGiudice', component: HomeGiudiceComponent},
    {path: 'homeCantante', component: HomeCantanteComponent}
    
  ];

  @NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forRoot(routes, {useHash: true})]
  })
  export class AppRoutingModule {}