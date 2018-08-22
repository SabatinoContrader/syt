import { Component, OnInit } from '@angular/core';
import { Utente } from '../../models/utente.model';
import { SearchFromCantanteService } from '../../services/search-from-cantante.service';
import { Router } from '../../../../node_modules/@angular/router';
import {LoginService} from '../../services/login.service';
import { RegistrazioneService } from '../../services/registrazione.service';
import { Registrazione } from '../../models/registrazione.model';

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

  constructor(private searchservice: SearchFromCantanteService, private loginservice: LoginService, private registrazioneService: RegistrazioneService, private router: Router) { }

  ngOnInit() {
  }

  search() {
     this.searchservice.searchCantante(this.username).subscribe(response => {this.listaUtenti = response.data});
    }

  logout() {
     this.loginservice.logOut();
     this.router.navigateByUrl("/login");
    }  

    listenRec(username: string) {
      this.registrazioneService.listenRec(username).subscribe(response => {
        this.listaRec = response.data});
        //this.router.navigateByUrl("/prodotti");
      }
}  
