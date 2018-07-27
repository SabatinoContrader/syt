package com.sytSpring.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.*;
import java.sql.Date;


//@Data
@NoArgsConstructor 
@AllArgsConstructor
@Getter @Setter
@Entity

public class Registrazione {
	
	@Id                                                    
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	@Column (name ="id_registrazione")                                          
	private int idRegistrazione;
	@Column (name = "data_creazione")
    private Date dataCreazione;
	
	@ManyToOne
    @JoinColumn(name="id_canzone")
	private Canzone idCanzone;
    
	@ManyToOne
    @JoinColumn(name="id_utente")
	private Utente idUtente;


    
}
