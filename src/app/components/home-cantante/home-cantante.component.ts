import { Component, OnInit } from '@angular/core';
import { Utente } from '../../models/utente.model';
import { Router } from '../../../../node_modules/@angular/router';
import {LoginService} from '../../services/login.service';
import { Registrazione } from '../../models/registrazione.model';
import { CantanteService } from '../../services/cantante.service';

@Component({
  selector: 'app-home-cantante',
  templateUrl: './home-cantante.component.html',
  styleUrls: ['./home-cantante.component.css']
})
export class HomeCantanteComponent implements OnInit {
  username: string;
  utente: Utente;
  listaUtenti: Utente[];
  listaRecDaCantante: Registrazione[];
  classificaRec: Registrazione[];

  constructor(private cantanteservice: CantanteService, private loginservice: LoginService, private router: Router) { }

  ngOnInit() {
  }
  search() {
    this.cantanteservice.searchCantante(this.username).subscribe(response => {this.listaUtenti = response.data});
   }

 logout() {
    this.loginservice.logOut();
    this.router.navigateByUrl("/login");
   }  

   listenRecDaCantante(username: string) {
    this.cantanteservice.listenRecDaCantante(username).subscribe(response => {
      this.listaRecDaCantante = response.data});
    }

    getClassificaFinale() {
      this.cantanteservice.classificaFinale().subscribe(response => {this.classificaRec = response.data});
    }
}  

