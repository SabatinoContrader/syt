package com.sytSpring.dto;

import javax.persistence.Column;

public class UtenteDTO {
	
	private int idUtente;
	private String genere;
	private int livello;
	private String ruolo;
    private String username;
    private String password;
    
    public UtenteDTO() {
		
	}

	public UtenteDTO(int idUtente, String genere, int livello, String ruolo, String username,String password) {
		this.idUtente = idUtente;
		this.genere = genere;
		this.livello = livello;
		this.ruolo = ruolo;
		this.username = username;
		this.password=password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(int idUtente) {
		this.idUtente = idUtente;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	
    
    
    
}
