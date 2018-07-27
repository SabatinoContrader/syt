package com.sytSpring.dao;

import java.util.List;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.jca.cci.connection.*;

import com.sytSpring.model.VotazioneSistema;

@Repository
@Transactional
public interface VotazioneSistemaRepository extends CrudRepository<VotazioneSistema, Long> {

	
	VotazioneSistema save(VotazioneSistema votazioneSistema);
	
	@Modifying
	@Query("UPDATE VotazioneSistema SET votatoDaGiudice = true where idRegistrazione = ?1")
	void updateSistema(int idRegistrazione);

}