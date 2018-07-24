package com.sytSpring.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sytSpring.model.Utente;

@Repository
@Transactional
public interface UtenteRepository extends CrudRepository<Utente, Long>{ 
	
	Utente findByUsername(String username);

}
