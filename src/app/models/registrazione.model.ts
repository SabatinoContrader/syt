export class Registrazione {
    idRegistrazione: number;
    dataCreazione: string;
    idCanzone: number;
    idUtente: number;
    
      
    constructor(idRegistrazione: number, dataCreazione: string, idCanzone: number, idUtente: number) {
        this.idRegistrazione = idRegistrazione;
        this.dataCreazione = dataCreazione;
        this.idCanzone = idCanzone;
        this.idUtente = idUtente;
      }
  }