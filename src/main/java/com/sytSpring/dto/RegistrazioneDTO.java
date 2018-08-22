package com.sytSpring.dto;

import java.sql.Date;

public class RegistrazioneDTO {
	
	private int idRegistrazione;
	private Date dataCreazione;
	private int idCanzone;
	
	public RegistrazioneDTO() {

	}
	
	

	public RegistrazioneDTO(int idRegistrazione, Date dataCreazione, int idCanzone) {
		
		this.idRegistrazione = idRegistrazione;
		this.dataCreazione = dataCreazione;
		this.idCanzone = idCanzone;
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
