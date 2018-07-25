package com.sytSpring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

//@Data
@NoArgsConstructor 
@AllArgsConstructor
@Getter @Setter
@Entity


public class VotazioneGiudice {

	@Id                                                    
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	@Column (name ="id_votazione_giudice")                                          
	private int idVotazionegiudice;
	@Column (name = "id_registrazione")
    private int idRegistrazione;
	@Column (name = "id_giudice")
    private int idGiudice;
	@Column
    private double timbro;
	@Column
    private double intonazione;
	@Column
    private double tono;
	@Column
    private double unicita;
	@Column
	private double media;
}
