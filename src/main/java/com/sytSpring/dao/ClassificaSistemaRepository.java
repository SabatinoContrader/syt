package com.sytSpring.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sytSpring.model.Registrazione;

@Repository
@Transactional
public interface ClassificaSistemaRepository extends CrudRepository<Registrazione, Long>{
	
	
	
	@Modifying
	@Query("SELECT  r FROM Registrazione r , VotazioneSistema v \r\n" + 
			"WHERE r.idRegistrazione=v.idRegistrazione \r\n" + 
			"AND data < '2018-07-25' \r\n" + 
			"AND data > '2018-07-20' \r\n" + 
			"ORDER BY fedelta DESC")
	 public List<Registrazione> selectTop10();

}

/*"SELECT  r FROM Registrazione r , VotazioneSistema v \r\n" + 
			"WHERE r.idregistrazione=v.idregistrazione \r\n" + 
			"AND data < '2018-07-25'\r\n" + 
			"AND data > '2018-07-20'\r\n" + 
			"ORDER BY fedelta DESC LIMIT 10"*/