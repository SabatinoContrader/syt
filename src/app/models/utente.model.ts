export class Utente {
    idUtente: number;
    genere: string;
    livello: number;
    ruolo: string;
    username: string;
    password: string;
    
      
    constructor(idUtente: number, genere: string, livello: number, ruolo: string, username: string, password: string) {
      this.idUtente = idUtente;
      this.genere = genere;
      this.livello = livello;
      this.ruolo = ruolo;
      this.username = username;
      this.password = password;
    }
  }