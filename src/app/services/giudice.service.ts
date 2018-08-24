import {enviroment} from '../models/enviroment.model';
import {Utente} from '../models/utente.model';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';

import {Observable, of} from 'rxjs';
import {tap, catchError} from 'rxjs/operators';

@Injectable()
export class GiudiceService {
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

  listenRec(username: string): Observable<any> {
    return this.http.get<any>('http://localhost:8080/giudiceController/ascolta?username=' + username)
    .pipe(tap((response) => console.log("deleteProduct"), catchError(this.handleError("delete error", {})))
    );
  }
  classificaFinale(): Observable<any> {
    return this.http.get<any>('http://localhost:8080/giudiceController/getClassificaFinale')
     .pipe(tap((response) => console.log("Prodotto"), catchError(this.handleError("login error", {})))
      );
  }
}
