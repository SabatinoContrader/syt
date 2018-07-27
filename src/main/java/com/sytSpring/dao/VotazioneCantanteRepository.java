package com.sytSpring.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sytSpring.model.VotazioneCantante;

@Repository
@Transactional
public interface VotazioneCantanteRepository extends CrudRepository<VotazioneCantante, Long> {

	boolean findByIdRegistrazione(int idRegistrazione);

	
	VotazioneCantante save(VotazioneCantante vc);

	@Modifying
	@Query("UPDATE VotazioneCantante SET voti=voti+1 ,orecchiabilita=((orecchiabilita+?2)/2) ,loScaricheresti=((loScaricheresti+?3)/2), media=((media+?4)/2) where idRegistrazione=?1")
	void updateVoti(int idRegistrazione, double orecchiabilita, double loScaricheresti, double media);

	
}
