import {Utente} from '../../models/utente.model';
import {LoginService} from '../../services/login.service';
import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {
  username: string;
  password: string;
  utente: Utente;

  constructor(private loginservice: LoginService, private router: Router) {}

  ngOnInit() {
    if (this.loginservice.isLogged()) {
      var utente = JSON.parse(sessionStorage.getItem("utente"));
      if(utente.ruolo === "C"){
        this.router.navigate(['homeCantante']);
      }
      else {
        this.router.navigate(['homeGiudice']);
      }
      
    }
  }

  login(): void {
    this.loginservice.login(this.username, this.password).subscribe((response) => {
      if (response != null) {

        this.utente = response;
        sessionStorage.setItem("utente", JSON.stringify(this.utente));
        if (this.utente.ruolo.toString() === "C" ){
          this.router.navigateByUrl("/homeCantante");
        }
        else{
          this.router.navigateByUrl("/homeGiudice");
        }      
      }
    }
  )
  }
}