package com.sytSpring.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sytSpring.model.Utente;

	@Repository
	@Transactional
	public interface RegisterRepository extends CrudRepository<Utente, Long>{ 
		
		Utente findByUsername(String username);
		Utente save(Utente utente);
		boolean existsByUsername(String username);
		
		
		/*@Modifying
		@Query("UPDATE Utente SET cognome=?1, dataNascita=?2, email=?3, genere=?4, luogoNascita=?5, nome=?6, password=?7, ruolo=?8, sesso=?9, telefono=?10, username=?11 where id=?9")
		void updateUtente(String cognome, String dataNascita, String email, String genere, String luogoNascita, String nome, String password, String ruolo, String sesso, String telefono, String username, int id);
	*/
	}
	
	
	