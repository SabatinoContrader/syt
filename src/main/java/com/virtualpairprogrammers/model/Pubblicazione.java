package com.virtualpairprogrammers.model;

public class Pubblicazione {
private int idPublicazione;
private String pubblicazione;
private int idUtente;


public Pubblicazione(int idPublicazione, String pubblicazione, int idUtente) {
	this.idPublicazione = idPublicazione;
	this.pubblicazione = pubblicazione;
	this.idUtente = idUtente;
}


public int getidPublicazione() {
	return idPublicazione;
}
public void setidPublicazione(int idPublicazione) {
	this.idPublicazione = idPublicazione;
}
public String getPubblicazione() {
	return pubblicazione;
}
public void setPubblicazione(String pubblicazione) {
	this.pubblicazione = pubblicazione;
}
public int getidUtente() {
	return idUtente;
}
public void setidUtente(int idUtente) {
	this.idUtente = idUtente;
}

}
