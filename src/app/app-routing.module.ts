import {LoginComponent} from './components/login/login.component';
import { NgModule } from '../../node_modules/@angular/core';
import { RouterModule, Routes } from '../../node_modules/@angular/router';
import { RegisterComponent } from './components/register/register.component';

const routes: Routes = [
    {path: '', redirectTo: '/login', pathMatch: 'full'},
    {path: 'login', component: LoginComponent},
    {path: 'register', component: RegisterComponent},
  ];

  @NgModule({
    exports: [RouterModule],
    imports: [RouterModule.forRoot(routes, {useHash: true})]
  })
  export class AppRoutingModule {}