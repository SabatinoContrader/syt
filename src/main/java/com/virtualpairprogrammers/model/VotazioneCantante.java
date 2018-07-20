package com.virtualpairprogrammers.model;

public class VotazioneCantante {
	
	private int idVotazioneCantante;
	private int idRegistrazione;
	private int idCantante;
	private double orecchiabilita;
	private double download;
	public VotazioneCantante(int idVotazioneCantante, int idRegistrazione, int idCantante, double orecchiabilita,
			double download) {
		super();
		this.idVotazioneCantante = idVotazioneCantante;
		this.idRegistrazione = idRegistrazione;
		this.idCantante = idCantante;
		this.orecchiabilita = orecchiabilita;
		this.download = download;
	}
	public int getIdVotazioneCantante() {
		return idVotazioneCantante;
	}
	public void setIdVotazioneCantante(int idVotazioneCantante) {
		this.idVotazioneCantante = idVotazioneCantante;
	}
	public int getIdRegistrazione() {
		return idRegistrazione;
	}
	public void setIdRegistrazione(int idRegistrazione) {
		this.idRegistrazione = idRegistrazione;
	}
	public int getIdCantante() {
		return idCantante;
	}
	public void setIdCantante(int idCantante) {
		this.idCantante = idCantante;
	}
	public double getOrecchiabilita() {
		return orecchiabilita;
	}
	public void setOrecchiabilita(double orecchiabilita) {
		this.orecchiabilita = orecchiabilita;
	}
	public double getDownload() {
		return download;
	}
	public void setDownload(double download) {
		this.download = download;
	}

}