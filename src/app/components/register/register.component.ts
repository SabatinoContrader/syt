import { Component, OnInit } from '@angular/core';
import { Register } from '../../models/register.model';
import { Router } from '../../../../node_modules/@angular/router';
import { RegisterService } from '../../services/register.service';

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

  constructor(private registerservice: RegisterService, private router: Router) {}

  ngOnInit() {
  }

  registered(): void {
    this.registerservice.register(this.nome, this.cognome, this.email, this.dataNascita, this.luogoNascita, this.sesso, this.username, this.password, this.ruolo, this.genere).subscribe((response) => {
      if (response != null) {
          this.router.navigateByUrl("/login");
        }
        else{
          this.router.navigateByUrl("/register");
        }      
      }
  )
  }
}