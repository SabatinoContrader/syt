package com.sytSpring.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sytSpring.model.VotazioneCantante;

@Repository
@Transactional
public interface VotazioneCantanteRepository extends CrudRepository<VotazioneCantante, Long> {

	
}
