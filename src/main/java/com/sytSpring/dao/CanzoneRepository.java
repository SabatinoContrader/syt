package com.sytSpring.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sytSpring.model.Canzone;

	@Repository
	@Transactional
	public interface CanzoneRepository extends CrudRepository<Canzone, Long>{ 
		List<Canzone> findAllByLivelloAndGenere(int livello, String genere);
		Canzone findByidCanzone(int idcanzone);
		
	}

