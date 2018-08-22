import {Component, OnInit} from '@angular/core';
import { Router } from '../../../../node_modules/@angular/router';
import {LoginService} from '../../services/login.service';

@Component({
  selector: 'app-contactfromcantante',
  templateUrl: './contactfromcantante.component.html',
  styleUrls: ['./contactfromcantante.component.css']
})
export class ContactfromcantanteComponent implements OnInit {

  constructor(private loginservice: LoginService, private router: Router) { }

  ngOnInit() {
  }

  logout() {
    this.loginservice.logOut();
    this.router.navigateByUrl("/login");
   }  
}
