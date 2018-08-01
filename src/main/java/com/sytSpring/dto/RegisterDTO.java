package com.sytSpring.dto;

import javax.persistence.Column;

public class RegisterDTO {

	private String nome;
	private String cognome;
	private String email;
	private String dataNascita;
	private String luogoNascita;
	private String sesso;
	private String telefono;
	private String username;
	private String password;
	private String genere;
	private String ruolo;

	public RegisterDTO() {

	}
	
	public RegisterDTO(String nome, String cognome, String email, String dataNascita, String luogoNascita, String sesso,
			String telefono, String username, String password, String genere, String ruolo) {

		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dataNascita = dataNascita;
		this.luogoNascita = luogoNascita;
		this.sesso = sesso;
		this.telefono = telefono;
		this.username = username;
		this.password = password;
		this.genere = genere;
		this.ruolo = ruolo;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getLuogoNascita() {
		return luogoNascita;
	}

	public void setLuogoNascita(String luogoNascita) {
		this.luogoNascita = luogoNascita;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}



}
