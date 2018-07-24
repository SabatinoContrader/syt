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


public class VotazioneCantante {

	@Id                                                    
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	@Column (name ="id_votazione_cantante")                                          
	private int idvotazionecantante;
	@Column (name = "id_registrazione")
    private int idregistrazione;
	@Column (name = "id_cantante")
    private int idcantante;
	@Column (name = "lo_scaricheresti")
    private Double loscaricheresti;
	@Column
    private Double orecchiabilita;
	
}
