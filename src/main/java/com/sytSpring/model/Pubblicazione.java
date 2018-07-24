package com.sytSpring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;

//@Data
@NoArgsConstructor 
@AllArgsConstructor
@Getter @Setter
@Entity


public class Pubblicazione {
	
	@Id                                                    
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	@Column (name ="id_pubblicazione")                                          
	private int idpubblicazione;
	@Column
    private String pubblicazione;
	
	@ManyToOne
    @JoinColumn(name="id_utente")
	private Utente idutente;
    	
}

