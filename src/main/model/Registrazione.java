package main.model;

public class Registrazione {
private int idRegistrazione;
private String registrazione;
private int idUtente;
private int idCanzone;
private String dataCreazione;


public Registrazione(int idRegistrazione, String registrazione, int idUtente, int idCanzone, String dataCreazione) {
	
	this.idRegistrazione = idRegistrazione;
	this.registrazione = registrazione;
	this.idUtente = idUtente;
	this.idCanzone = idCanzone;
	this.dataCreazione = dataCreazione;
}


public int getIdRegistrazione() {
	return idRegistrazione;
}


public void setIdRegistrazione(int idRegistrazione) {
	this.idRegistrazione = idRegistrazione;
}


public String getRegistrazione() {
	return registrazione;
}


public void setRegistrazione(String registrazione) {
	this.registrazione = registrazione;
}


public int getIdUtente() {
	return idUtente;
}


public void setIdUtente(int idUtente) {
	this.idUtente = idUtente;
}


public int getIdCanzone() {
	return idCanzone;
}


public void setIdCanzone(int idCanzone) {
	this.idCanzone = idCanzone;
}


public String getDataCreazione() {
	return dataCreazione;
}


public void setDataCreazione(String dataCreazione) {
	this.dataCreazione = dataCreazione;
}




}
