package com.sytSpring.dto;

import java.sql.Date;

public class RegistrazioneDTO {
	
	private int idRegistrazione;
	private Date dataCreazione;
	private int idCanzone;
	private int idUtente;
	
	public RegistrazioneDTO() {

	}
	
	

	public RegistrazioneDTO(int idRegistrazione, Date dataCreazione, int idCanzone, int idUtente) {
		
		this.idRegistrazione = idRegistrazione;
		this.dataCreazione = dataCreazione;
		this.idCanzone = idCanzone;
		this.idUtente = idUtente;
	}



	public int getIdUtente() {
		return idUtente;
	}



	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}



	public int getIdRegistrazione() {
		return idRegistrazione;
	}



	public void setIdRegistrazione(int idRegistrazione) {
		this.idRegistrazione = idRegistrazione;
	}



	public Date getDataCreazione() {
		return dataCreazione;
	}



	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}



	public int getIdCanzone() {
		return idCanzone;
	}



	public void setIdCanzone(int idCanzone) {
		this.idCanzone = idCanzone;
	}
	

}
