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
	private int idvotazionegiudice;
	@Column (name = "id_registrazione")
    private int idregistrazione;
	@Column (name = "id_giudice")
    private int idgiudice;
	@Column
    private Double timbro;
	@Column
    private Double intonazione;
	@Column
    private Double tono;
	@Column
    private Double unicita;
	
}
