package com.virtualpairprogrammers.model;

public class Registrazione {

private int idRegistrazione;
private int idUtente;
private int idCanzone;
private String dataCreazione;


public Registrazione(int idRegistrazione, int idUtente, int idCanzone, String dataCreazione) {
	super();
	this.idRegistrazione = idRegistrazione;
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


@Override
public String toString() {
	return "[ID Registrazione = " + idRegistrazione + ", Data Creazione = " + dataCreazione + "]";
}


}
