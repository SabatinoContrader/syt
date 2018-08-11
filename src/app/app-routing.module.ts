import {LoginComponent} from './components/login/login.component';
import { NgModule } from '../../node_modules/@angular/core';
import { RouterModule, Routes } from '../../node_modules/@angular/router';
import { RegisterComponent } from './components/register/register.component';
import { HomeGiudiceComponent } from './components/home-giudice/home-giudice.component';
import { HomeCantanteComponent } from './components/home-cantante/home-cantante.component';
import { ContactComponent } from './components/contact/contact.component';

const routes: Routes = [
    {path: '', redirectTo: '/login', pathMatch: 'full'},
    {path: 'login', component: LoginComponent},
    {path: 'register', component: RegisterComponent},
    {path: 'homeGiudice', component: HomeGiudiceComponent},
    {path: 'homeCantante', component: HomeCantanteComponent},
    {path: 'contact', component: ContactComponent},    
  ];

  @NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forRoot(routes, {useHash: true})]
  })
  export class AppRoutingModule {}