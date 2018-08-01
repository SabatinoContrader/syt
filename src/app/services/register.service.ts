import {enviroment} from '../models/enviroment.model';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';

import {Observable, of} from 'rxjs';
import {tap, catchError} from 'rxjs/operators';
import { Register } from '../models/register.model';

@Injectable()
export class RegisterService {
  private urlBase = enviroment.url;

  constructor(private http: HttpClient) {}

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
  }

/*   isLogged(): boolean {
    if (typeof (Storage) !== "undefined") {
      if (sessionStorage.getItem("utente") != null) {
        return true;
      }
    } return false;
  } */

  register(nome: string, cognome: string, email: string, dataNascita: string, luogoNascita: string, sesso: string, username: string, password: string, ruolo: string, genere: string): Observable<Register> {
    var register = new Register(nome, cognome, email, dataNascita, luogoNascita, sesso, username, password, ruolo, genere);
    return this.http.post<Register>('http://localhost:8080/Register/registered', register)
      .pipe(tap((response) => console.log("Register"), catchError(this.handleError("register error", {})))
      );
  }

  logOut() {
    if (typeof (Storage) !== "undefined") {
      //sessionStorage.setItem("utente", null);
      // sessionStorage.clear();
      sessionStorage.removeItem("utente");
    }
  }
}