export class Registrazione {
    idRegistrazione: number;
    dataCreazione: string;
    idCanzone: number;
    
      
    constructor(idRegistrazione: number, dataCreazione: string, idCanzone: number) {
        this.idRegistrazione = idRegistrazione;
        this.dataCreazione = dataCreazione;
        this.idCanzone = idCanzone;
      }
  }