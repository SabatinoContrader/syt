import { Component, OnInit } from '@angular/core';
import { Utente } from '../../models/utente.model';
import { Router } from '../../../../node_modules/@angular/router';
import {LoginService} from '../../services/login.service';
import { Registrazione } from '../../models/registrazione.model';
import { GiudiceService } from '../../services/giudice.service';

@Component({
  selector: 'app-home-giudice',
  templateUrl: './home-giudice.component.html',
  styleUrls: ['./home-giudice.component.css']
})
export class HomeGiudiceComponent implements OnInit {
  username: string;
  utente: Utente;
  listaUtenti: Utente[];
  listaRec: Registrazione[];
  classificaRec: Registrazione[];
  classificaRecSist: Registrazione[];

  constructor(private giudiceservice: GiudiceService, private loginservice: LoginService, private router: Router) { }

  ngOnInit() {
  }

  search() {
     this.giudiceservice.searchCantante(this.username).subscribe(response => {this.listaUtenti = response.data});
    }

  logout() {
     this.loginservice.logOut();
     this.router.navigateByUrl("/login");
    }  

    listenRec(username: string) {
      this.giudiceservice.listenRec(username).subscribe(response => {
        this.listaRec = response.data});
        //this.router.navigateByUrl("/prodotti");
      }
      getClassificaFinale() {
        this.giudiceservice.classificaFinale().subscribe(response => {this.classificaRec = response.data});
      }

      getClassifica() {
        this.giudiceservice.classificaSistema().subscribe(response => {this.classificaRecSist = response.data});
      }
}  
