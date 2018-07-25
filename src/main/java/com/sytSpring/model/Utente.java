package com.sytSpring.model;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor

@Entity
public class Utente{

	@Id                                                    
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	@Column(name = "id_utente")                                         
	private int idUtente;
	@Column
    private String nome;
	@Column
    private String cognome;
	@Column
    private String email;
	@Column (name = "data_nascita")
    private Date dataNascita;
	@Column (name = "luogo_nascita")
    private String  luogoNascita;
	@Column
    private String sesso;
	@Column
    private String genere;
	@Column
    private int livello;
	@Column
    private String telefono;
	@Column
    private String ruolo;
	@Column (name = "cantante_to_giudice")
    private int cantanteToGiudice;
	@Column
    private int tentativi;
	@Column
    private String username;
	@Column
    private String password;
	@Column (name = "media_voto")
    private double mediaVoto;
	@Column (name = "n_voti")
    private int nVoti;
}
