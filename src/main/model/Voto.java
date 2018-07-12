package main.model;

public class Voto {
	
	private int idUtente;
	private int idRegistrazione;
	private int voto;
	private String data;
	
    public Voto (int idUtente, int idRegistrazione, int voto, String data) {
	this.idUtente= idUtente;
	this.idRegistrazione= idRegistrazione;
	this.voto= voto;
	this.data= data;
    }
    
    public int getidUtente(){
	return idUtente;}
    
    
    public void setidUtente( int idUtente) {
	this.idUtente= idUtente;}
    
    
    public int getidRegistrazione () {
    	return idRegistrazione;
    }
    
    public void setidRegistrazione( int idRegistrazione) {
    	this.idRegistrazione= idRegistrazione;
    }
    
    public int getvoto() {
    	return voto;
    }
    
    public void setvoto(int voto) {
    	this.voto= voto;
    	
    }
    public String getdata() {
    	return data;
    }
    
    public void setdata(String data) {
    	this.data=data;
    }
    
    
	

}
