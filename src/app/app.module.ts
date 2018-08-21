import {AppRoutingModule} from './app-routing.module';
import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {AppComponent} from './app.component';
import {HttpClientModule} from '@angular/common/Http';
import {LoginService} from './services/login.service';
import { LoginComponent } from './components/login/login.component';
import { RegisterComponent } from './components/register/register.component';
import { HomeCantanteComponent } from './components/home-cantante/home-cantante.component';
import { HomeGiudiceComponent } from './components/home-giudice/home-giudice.component';
import { RegisterService } from './services/register.service';
import { ContactComponent } from './components/contact/contact.component';
import { SearchFromCantanteService } from './services/search-from-cantante.service';
import { SearchFromGiudiceService } from './services/search-from-giudice.service';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeCantanteComponent,
    HomeGiudiceComponent,
    ContactComponent,
  
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [LoginService, RegisterService, SearchFromCantanteService, SearchFromGiudiceService],
  bootstrap: [AppComponent]
})
export class AppModule {}