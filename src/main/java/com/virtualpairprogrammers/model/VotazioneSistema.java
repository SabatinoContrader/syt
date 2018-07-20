package com.virtualpairprogrammers.model;

public class VotazioneSistema {

	private int idVotazioneSistema;
	private int idRegistrazione;
	private double fedelta;
	private double intonazione;
	private double potenza;
	private double estensione;
	private String data;
	
	public VotazioneSistema(int idVotazioneSistema, int idRegistrazione, double fedelta, double intonazione,
			double potenza, double estensione, String data) {
		
		this.idVotazioneSistema = idVotazioneSistema;
		this.idRegistrazione = idRegistrazione;
		this.fedelta = fedelta;
		this.intonazione = intonazione;
		this.potenza = potenza;
		this.estensione = estensione;
		this.data = data;
	}

	public int getIdVotazioneSistema() {
		return idVotazioneSistema;
	}

	public void setIdVotazioneSistema(int idVotazioneSistema) {
		this.idVotazioneSistema = idVotazioneSistema;
	}

	public int getIdRegistrazione() {
		return idRegistrazione;
	}

	public void setIdRegistrazione(int idRegistrazione) {
		this.idRegistrazione = idRegistrazione;
	}

	public double getFedelta() {
		return fedelta;
	}

	public void setFedelta(double fedelta) {
		this.fedelta = fedelta;
	}

	public double getIntonazione() {
		return intonazione;
	}

	public void setIntonazione(double intonazione) {
		this.intonazione = intonazione;
	}

	public double getPotenza() {
		return potenza;
	}

	public void setPotenza(double potenza) {
		this.potenza = potenza;
	}

	public double getEstensione() {
		return estensione;
	}

	public void setEstensione(double estensione) {
		this.estensione = estensione;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "VotazioneSistema [idVotazioneSistema=" + idVotazioneSistema + ", idRegistrazione=" + idRegistrazione
				+ ", fedelta=" + fedelta + ", intonazione=" + intonazione + ", potenza=" + potenza + ", estensione="
				+ estensione + ", data=" + data + "]";
	}
	
	
	
}
