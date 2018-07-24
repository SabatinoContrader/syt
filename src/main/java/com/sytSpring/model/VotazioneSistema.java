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
	private int idvotazionesistema;
	@Column (name = "id_registrazione")
    private int idregistrazione;
	@Column
    private Double fedelta;
	@Column
    private Double intonazione;
	@Column
    private Double potenza;
	@Column
    private Double estensione;
	@Column 
    private Date data;
	
}
