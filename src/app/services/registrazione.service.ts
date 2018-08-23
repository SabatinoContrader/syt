import { Injectable } from '@angular/core';
import { HttpClient } from '../../../node_modules/@angular/common/http';
import { Observable, of } from '../../../node_modules/rxjs';
import { tap, catchError } from '../../../node_modules/rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class RegistrazioneService {

  constructor(private http: HttpClient) { }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      console.error(error);
      console.log(`${operation} failed: ${error.message}`);
      return of(result as T);
    };
  }

    listenRec(username: string): Observable<any> {
      return this.http.get<any>('http://localhost:8080/giudiceController/ascolta?username=' + username)
      .pipe(tap((response) => console.log("deleteProduct"), catchError(this.handleError("delete error", {})))
      );
    }
      listenRecDaCantante(username: string): Observable<any> {
        return this.http.get<any>('http://localhost:8080/cantanteController/ascoltaDaCantante?username=' + username)
        .pipe(tap((response) => console.log("deleteProduct"), catchError(this.handleError("delete error", {})))
        );
  }
}
