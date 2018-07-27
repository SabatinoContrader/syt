package com.sytSpring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;
import java.sql.Date;


//@Data
@NoArgsConstructor 
@AllArgsConstructor
@Getter @Setter
@Entity


public class VotazioneSistema {
	
	@Id                                                    
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	@Column (name ="id_votazione_sistema")                                          
	private int idVotazionesistema;
	@Column (name = "id_registrazione")
    private int idRegistrazione;
	@Column
    private double fedelta;
	@Column
    private double intonazione;
	@Column
    private double potenza;
	@Column
    private double estensione;
	@Column 
    private String data;
	@Column
	private double media;
	@Column(name = "votato_da_giudice")
	private boolean votatoDaGiudice;
	
}
