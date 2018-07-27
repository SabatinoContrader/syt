package com.sytSpring.dao;

import java.util.List;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.jca.cci.connection.*;

import com.sytSpring.model.Utente;

@Repository
@Transactional
public interface UtenteRepository extends CrudRepository<Utente, Long> {

	Utente findByUsername(String username);
	Utente save(Utente utente);
	boolean existsByUsername(String username);

	//List<Utente> findAllByUsernameAndRuolo(String username, String ruolo);
	@Modifying
	@Query("select u from Utente u where u.username like ?1 and u.ruolo=?2")
	List<Utente> searchCantanti(String username, String ruolo);
	
}