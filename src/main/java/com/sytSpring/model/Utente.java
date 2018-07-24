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
	@Column                                                
	private int id_utente;
	@Column
    private String nome;
	@Column
    private String cognome;
	@Column
    private String email;
	@Column
    private Date data_nascita;
	@Column
    private String luogo_nascita;
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
	@Column
    private int cantante_to_giudice;
	@Column
    private int tentativi;
	@Column
    private String username;
	@Column
    private String password;
	@Column
    private double media_voto;
	@Column
    private int n_voti;
}
