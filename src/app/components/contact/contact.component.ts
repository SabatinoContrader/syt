import {Component, OnInit} from '@angular/core';
import { Router } from '@angular/router';
import {LoginService} from '../../services/login.service';

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  constructor(private loginservice: LoginService, private router: Router) { }

  ngOnInit() {
  }

  logout() {
    this.loginservice.logOut();
    this.router.navigateByUrl("/login");
   }  
}
