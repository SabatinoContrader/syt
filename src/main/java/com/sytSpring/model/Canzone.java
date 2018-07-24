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


public class Canzone {
	@Id                                                    
	@GeneratedValue(strategy = GenerationType.IDENTITY)    
	@Column (name ="id_canzone")                                          
	private int idcanzone;
	@Column 
    private int livello;
	@Column 
    private String genere;
	@Column (name = "url_canzone")
    private String urlcanzone;
	@Column 
    private String titolo;

}
