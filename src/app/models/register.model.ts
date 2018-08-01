export class Register {
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
    
      
    constructor(nome: string, cognome: string, email: string, dataNascita: string, luogoNascita: string, sesso: string, username: string, password: string, ruolo: string, genere: string) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.sesso = sesso;
        this.username = username;
        this.password = password;
        this.ruolo = ruolo;
        this.genere = genere;
      }
  }