import { Component, OnInit } from '@angular/core';
import { Utente } from '../../models/utente.model';
import { SearchFromCantanteService } from '../../services/search-from-cantante.service';
import { Router } from '../../../../node_modules/@angular/router';
import {LoginService} from '../../services/login.service';
import { RegistrazioneService } from '../../services/registrazione.service';
import { Registrazione } from '../../models/registrazione.model';

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

  constructor(private searchservice: SearchFromCantanteService, private loginservice: LoginService,private registrazioneService: RegistrazioneService, private router: Router) { }

  ngOnInit() {
  }
  search() {
    this.searchservice.searchCantante(this.username).subscribe(response => {this.listaUtenti = response.data});
   }

 logout() {
    this.loginservice.logOut();
    this.router.navigateByUrl("/login");
   }  
   listenRecDaCantante(username: string) {
    this.registrazioneService.listenRecDaCantante(username).subscribe(response => {
      this.listaRecDaCantante = response.data});
      //this.router.navigateByUrl("/prodotti");
    }
}  

