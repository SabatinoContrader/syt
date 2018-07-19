package com.virtualpairprogrammers.model;

public class Canzone {
	private int idCanzone;
	private int livello;
	private String genere;
	private String urlCanzone;
	private String titolo;

	public Canzone(int idCanzone, int livello, String genere, String urlCanzone, String titolo) {
		this.idCanzone = idCanzone;
		this.livello = livello;
		this.genere = genere;
		this.urlCanzone = urlCanzone;
		this.titolo = titolo;
	}

	public int getIdCanzone() {
		return idCanzone;
	}

	public void setIdCanzone(int idCanzone) {
		this.idCanzone = idCanzone;
	}

	public String getUrlCanzone() {
		return urlCanzone;
	}

	public void setUrlCanzone(String urlCanzone) {
		this.urlCanzone = urlCanzone;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getIdcanzone() {
		return idCanzone;
	}

	public void setIdcanzone(int idCanzone) {
		this.idCanzone = idCanzone;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getUrlcanzone() {
		return urlCanzone;
	}

	public void setUrlcanzone(String urlCanzone) {
		this.urlCanzone = urlCanzone;

	}

	@Override
	public String toString() {
		return "Canzone [idCanzone=" + idCanzone + ", livello=" + livello + ", genere=" + genere + ", urlCanzone="
				+ urlCanzone + ", titolo=" + titolo + "]";
	}
}
