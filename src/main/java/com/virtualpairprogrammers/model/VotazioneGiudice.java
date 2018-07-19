package com.virtualpairprogrammers.model;

public class VotazioneGiudice {
	
	private int idVotazioneGiudice;
	private int idRegistrazione;
	private int idGiudice;
	private double intonazione;
	private double timbro;
	private double tono;
	private double unicita;


	public VotazioneGiudice(int idVotazioneGiudice, int idRegistrazione, int idGiudice, double intonazione,
			double timbro, double tono, double unicita) {
		
		this.idVotazioneGiudice = idVotazioneGiudice;
		this.idRegistrazione = idRegistrazione;
		this.idGiudice = idGiudice;
		this.intonazione = intonazione;
		this.timbro = timbro;
		this.tono = tono;
		this.unicita = unicita;
	}


	public int getIdVotazioneGiudice() {
		return idVotazioneGiudice;
	}


	public void setIdVotazioneGiudice(int idVotazioneGiudice) {
		this.idVotazioneGiudice = idVotazioneGiudice;
	}


	public int getIdRegistrazione() {
		return idRegistrazione;
	}


	public void setIdRegistrazione(int idRegistrazione) {
		this.idRegistrazione = idRegistrazione;
	}


	public int getIdGiudice() {
		return idGiudice;
	}


	public void setIdGiudice(int idGiudice) {
		this.idGiudice = idGiudice;
	}


	public double getIntonazione() {
		return intonazione;
	}


	public void setIntonazione(double intonazione) {
		this.intonazione = intonazione;
	}


	public double getTimbro() {
		return timbro;
	}


	public void setTimbro(double timbro) {
		this.timbro = timbro;
	}


	public double getTono() {
		return tono;
	}


	public void setTono(double tono) {
		this.tono = tono;
	}


	public double getUnicita() {
		return unicita;
	}


	public void setUnicita(double unicita) {
		this.unicita = unicita;
	}


	@Override
	public String toString() {
		return "VotazioneGiudice [idVotazioneGiudice=" + idVotazioneGiudice + ", idRegistrazione=" + idRegistrazione
				+ ", idGiudice=" + idGiudice + ", intonazione=" + intonazione + ", timbro=" + timbro + ", tono=" + tono
				+ ", unicita=" + unicita + "]";
		}
}