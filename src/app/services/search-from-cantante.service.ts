import {enviroment} from '../models/enviroment.model';
import {Utente} from '../models/utente.model';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';

import {Observable, of} from 'rxjs';
import {tap, catchError} from 'rxjs/operators';


@Injectable()
export class SearchFromCantanteService {
  private urlBase = enviroment.url;

  constructor(private http: HttpClient) {}

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      console.log('${operation} failed: ${error.message}');
      return of(result as T);
    };
  }

  searchCantante(username: string): Observable<any> {
    var utente = new Utente(0, " ", 0, " ", username, " ");
    return this.http.post<Utente>('http://localhost:8080/giudiceController/SearchCantante', utente)
      .pipe(tap((response) => console.log("Utente"), catchError(this.handleError("login error", {})))
      );
  }
}

