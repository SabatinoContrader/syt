package com.sytSpring.dao;

import java.util.List;
import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.jca.cci.connection.*;

import com.sytSpring.model.VotazioneGiudice;


@Repository
@Transactional
public interface VotazioneGiudiceRepository extends CrudRepository<VotazioneGiudice, Long> {

	
	VotazioneGiudice save(VotazioneGiudice votazioneGiudice);
	boolean findByIdRegistrazione(int idRegistrazione);
}