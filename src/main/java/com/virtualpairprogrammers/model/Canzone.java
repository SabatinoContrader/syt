package com.virtualpairprogrammers.model;

public class Canzone {
	private int idCanzone;
	private int livello;
    private String genere;
    private String urlCanzone;
    
public Canzone(int idCanzone, int livello,String genere,String urlCanzone) {
        this.idCanzone = idCanzone;
        this.livello = livello;
        this.genere = genere;
        this.urlCanzone = urlCanzone;
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
    
}
