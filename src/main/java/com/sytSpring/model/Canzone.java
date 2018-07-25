package com.sytSpring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	private int idCanzone;
	@Column 
    private int livello;
	@Column 
    private String genere;
	@Column (name = "url_canzone")
    private String urlCanzone;
	@Column 
    private String titolo;
	@OneToMany	(mappedBy="idCanzone")
	private List<Registrazione> reg=new ArrayList<>();

}
