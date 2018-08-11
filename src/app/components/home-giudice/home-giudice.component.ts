import { Component, OnInit } from '@angular/core';
import { Utente } from '../../models/utente.model';
import { SearchFromCantanteService } from '../../services/search-from-cantante.service';
import { Router } from '../../../../node_modules/@angular/router';
import {LoginService} from '../../services/login.service';

@Component({
  selector: 'app-home-giudice',
  templateUrl: './home-giudice.component.html',
  styleUrls: ['./home-giudice.component.css']
})
export class HomeGiudiceComponent implements OnInit {
  username: string;
  utente: Utente;
  listaUtenti: Utente[];

  constructor(private searchservice: SearchFromCantanteService, private loginservice: LoginService, private router: Router) { }

  ngOnInit() {
  }

  search() {
     this.searchservice.searchCantante(this.username).subscribe(response => {this.listaUtenti = response.data});
    }

  logout() {
     this.loginservice.logOut();
     this.router.navigateByUrl("/login");
    }  
}
