import { Component, OnInit } from '@angular/core';
import { Register } from '../../models/register.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  nome: string;
  cognome: string;
  email: string;
  dataNascita: string;
  luogoNascita: string;
  sesso: string;
  username: string;
  password: string;
  ruolo: string;
  genere: string;
  register: Register;

  constructor() { }

  ngOnInit() {
  }

}
