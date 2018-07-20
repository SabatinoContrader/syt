-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versione server:              5.7.22-log - MySQL Community Server (GPL)
-- S.O. server:                  Win64
-- HeidiSQL Versione:            9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dump della struttura di tabella sytdb.canzone
CREATE TABLE IF NOT EXISTS `canzone` (
  `id_canzone` int(11) NOT NULL AUTO_INCREMENT,
  `livello` int(11) NOT NULL,
  `genere` varchar(45) NOT NULL,
  `url_canzone` varchar(100) NOT NULL,
  `titolo` varchar(45) NOT NULL,
  PRIMARY KEY (`id_canzone`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella sytdb.canzone: ~3 rows (circa)
/*!40000 ALTER TABLE `canzone` DISABLE KEYS */;
INSERT INTO `canzone` (`id_canzone`, `livello`, `genere`, `url_canzone`, `titolo`) VALUES
	(1, 1, 'Pop', 'https://www.youtube.com/embed/mk48xRzuNvA', 'Hall Of Fame'),
	(2, 1, 'Pop', 'https://www.youtube.com/embed/AcHHE9bvLgY', 'Rockadown'),
	(3, 1, 'Pop', 'https://www.youtube.com/embed/_u78C6DnjLY', 'Halo');
/*!40000 ALTER TABLE `canzone` ENABLE KEYS */;

-- Dump della struttura di tabella sytdb.pubblicazione
CREATE TABLE IF NOT EXISTS `pubblicazione` (
  `id_pubblicazione` int(11) NOT NULL AUTO_INCREMENT,
  `pubblicazione` varchar(45) NOT NULL,
  `id_utente` int(11) NOT NULL,
  PRIMARY KEY (`id_pubblicazione`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella sytdb.pubblicazione: ~0 rows (circa)
/*!40000 ALTER TABLE `pubblicazione` DISABLE KEYS */;
/*!40000 ALTER TABLE `pubblicazione` ENABLE KEYS */;

-- Dump della struttura di tabella sytdb.registrazione
CREATE TABLE IF NOT EXISTS `registrazione` (
  `id_registrazione` int(11) NOT NULL AUTO_INCREMENT,
  `id_utente` int(11) NOT NULL,
  `data_creazione` datetime NOT NULL,
  `id_canzone` int(11) NOT NULL,
  PRIMARY KEY (`id_registrazione`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella sytdb.registrazione: ~2 rows (circa)
/*!40000 ALTER TABLE `registrazione` DISABLE KEYS */;
INSERT INTO `registrazione` (`id_registrazione`, `id_utente`, `data_creazione`, `id_canzone`) VALUES
	(1, 1, '2018-07-13 00:00:00', 1),
	(2, 1, '2018-07-15 20:19:17', 2);
/*!40000 ALTER TABLE `registrazione` ENABLE KEYS */;

-- Dump della struttura di tabella sytdb.utente
CREATE TABLE IF NOT EXISTS `utente` (
  `id_utente` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `cognome` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `data_nascita` date NOT NULL,
  `luogo_nascita` varchar(45) NOT NULL,
  `sesso` char(1) NOT NULL,
  `genere` varchar(45) NOT NULL,
  `livello` int(11) NOT NULL DEFAULT '1',
  `telefono` varchar(45) DEFAULT NULL,
  `ruolo` char(1) NOT NULL,
  `cantante_to_giudice` tinyint(3) unsigned zerofill NOT NULL,
  `tentativi` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `avatar` blob,
  `media_voto` double DEFAULT NULL,
  `n_voti` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_utente`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella sytdb.utente: ~8 rows (circa)
/*!40000 ALTER TABLE `utente` DISABLE KEYS */;
INSERT INTO `utente` (`id_utente`, `nome`, `cognome`, `email`, `data_nascita`, `luogo_nascita`, `sesso`, `genere`, `livello`, `telefono`, `ruolo`, `cantante_to_giudice`, `tentativi`, `username`, `password`, `avatar`, `media_voto`, `n_voti`) VALUES
	(1, 'Mario', 'Saponara', 'mario@tiscali.it', '2018-01-02', 'Agropoli', 'M', 'Pop', 1, '02881212', 'C', 000, 0, 'mario', 'mario', NULL, 4.28125, 5),
	(6, 'Giuseppe', 'Scagliola', 'g.scagliola@contrader.it', '1996-03-19', 'Terlizzi', 'M', 'Pop', 1, '3491547650', 'G', 000, 0, 'peppe', 'peppe', NULL, 0, 0),
	(7, 'Giuseppe', 'Rossi', 'g.rossi@contrader.it', '1985-05-15', 'Napoli', 'M', 'Rock', 1, '3544895210', 'C', 000, 0, 'apeppe2', 'peppe', NULL, 0, 0),
	(8, 'Mario', 'Rossi', 'm.rossi@contrader.it', '1980-06-14', 'Milano', 'M', 'Rap', 1, '3514789662', 'C', 000, 0, 'mario3', 'mario3', NULL, 0, 0),
	(9, 'emiliano', 'carluccio', 'emil@.it', '2015-11-13', 'maglie', 'M', 'pop', 1, '98899', 'C', 000, 0, 'emiliano', 'emiliano', NULL, NULL, NULL),
	(10, 'emiliano', 'carluccio', 'emil@.it', '2015-11-13', 'maglie', 'M', 'pop', 1, '98899', 'C', 000, 0, 'emiliano', 'emiliano', NULL, NULL, NULL),
	(11, 'emilrt', 'carluccio', 'emilianocarl@v.it', '2015-11-06', 'maglie', 'M', 'Rock', 1, '4488855', 'C', 000, 0, 'emilg', 'emilg', NULL, NULL, NULL),
	(12, 'Carlo', 'Del Colle', 'c.delcol@.it', '2015-12-12', 'Napoli', 'M', 'Rap', 1, '35566222', 'C', 000, 0, 'carlo', 'carlo', NULL, NULL, NULL);
/*!40000 ALTER TABLE `utente` ENABLE KEYS */;

-- Dump della struttura di tabella sytdb.votazione_cantante
CREATE TABLE IF NOT EXISTS `votazione_cantante` (
  `id_votazione_cantante` int(11) NOT NULL AUTO_INCREMENT,
  `id_registrazione` int(11) DEFAULT NULL,
  `id_cantante` int(11) DEFAULT NULL,
  `orecchiabilita` double DEFAULT NULL,
  `lo_scaricheresti` double DEFAULT NULL,
  PRIMARY KEY (`id_votazione_cantante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella sytdb.votazione_cantante: ~0 rows (circa)
/*!40000 ALTER TABLE `votazione_cantante` DISABLE KEYS */;
/*!40000 ALTER TABLE `votazione_cantante` ENABLE KEYS */;

-- Dump della struttura di tabella sytdb.votazione_giudice
CREATE TABLE IF NOT EXISTS `votazione_giudice` (
  `id_votazione_giudice` int(11) NOT NULL AUTO_INCREMENT,
  `id_registrazione` int(11) DEFAULT NULL,
  `id_giudice` int(11) DEFAULT NULL,
  `intonazione` double DEFAULT NULL,
  `timbro` double DEFAULT NULL,
  `tono` double DEFAULT NULL,
  `unicita` double DEFAULT NULL,
  PRIMARY KEY (`id_votazione_giudice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella sytdb.votazione_giudice: ~0 rows (circa)
/*!40000 ALTER TABLE `votazione_giudice` DISABLE KEYS */;
/*!40000 ALTER TABLE `votazione_giudice` ENABLE KEYS */;

-- Dump della struttura di tabella sytdb.votazione_sistema
CREATE TABLE IF NOT EXISTS `votazione_sistema` (
  `id_votazione_sistema` int(11) NOT NULL AUTO_INCREMENT,
  `id_registrazione` int(11) DEFAULT NULL,
  `fedelta` double DEFAULT NULL,
  `intonazione` double DEFAULT NULL,
  `potenza` double DEFAULT NULL,
  `estensione` double DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  PRIMARY KEY (`id_votazione_sistema`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella sytdb.votazione_sistema: ~0 rows (circa)
/*!40000 ALTER TABLE `votazione_sistema` DISABLE KEYS */;
/*!40000 ALTER TABLE `votazione_sistema` ENABLE KEYS */;

-- Dump della struttura di tabella sytdb.voto
CREATE TABLE IF NOT EXISTS `voto` (
  `id_registrazione` int(11) NOT NULL,
  `voto` int(11) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dump dei dati della tabella sytdb.voto: ~23 rows (circa)
/*!40000 ALTER TABLE `voto` DISABLE KEYS */;
INSERT INTO `voto` (`id_registrazione`, `voto`, `data`) VALUES
	(2, 2, '2018-07-16'),
	(2, 3, '2018-07-16'),
	(1, 2, '2018-07-16'),
	(1, 3, '2018-07-16'),
	(2, 4, '2018-07-16'),
	(1, 5, '2018-07-16'),
	(1, 3, '2018-07-16'),
	(1, 3, '2018-07-16'),
	(1, 5, '2018-07-16'),
	(2, 3, '2018-07-16'),
	(2, 3, '2018-07-16'),
	(2, 4, '2018-07-16'),
	(2, 4, '2018-07-16'),
	(2, 3, '2018-07-16'),
	(2, 3, '2018-07-16'),
	(2, 4, '2018-07-16'),
	(2, 4, '2018-07-16'),
	(1, 3, '2018-07-16'),
	(1, 3, '2018-07-16'),
	(1, 3, '2018-07-16'),
	(2, 4, '2018-07-16'),
	(2, 4, '2018-07-16'),
	(1, 5, '2018-07-16');
/*!40000 ALTER TABLE `voto` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
