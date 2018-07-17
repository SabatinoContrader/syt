-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: sytdb
-- ------------------------------------------------------
-- Server version	5.5.54-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `canzone`
--

DROP TABLE IF EXISTS `canzone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `canzone` (
  `id_canzone` int(11) NOT NULL AUTO_INCREMENT,
  `livello` int(11) NOT NULL,
  `genere` varchar(45) NOT NULL,
  `url_canzone` varchar(100) NOT NULL,
  `titolo` varchar(45) NOT NULL,
  PRIMARY KEY (`id_canzone`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canzone`
--

LOCK TABLES `canzone` WRITE;
/*!40000 ALTER TABLE `canzone` DISABLE KEYS */;
INSERT INTO `canzone` VALUES (1,1,'Pop','youtube','');
/*!40000 ALTER TABLE `canzone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pubblicazione`
--

DROP TABLE IF EXISTS `pubblicazione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pubblicazione` (
  `id_pubblicazione` int(11) NOT NULL AUTO_INCREMENT,
  `pubblicazione` varchar(45) NOT NULL,
  `id_utente` int(11) NOT NULL,
  PRIMARY KEY (`id_pubblicazione`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pubblicazione`
--

LOCK TABLES `pubblicazione` WRITE;
/*!40000 ALTER TABLE `pubblicazione` DISABLE KEYS */;
/*!40000 ALTER TABLE `pubblicazione` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registrazione`
--

DROP TABLE IF EXISTS `registrazione`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registrazione` (
  `id_registrazione` int(11) NOT NULL AUTO_INCREMENT,
  `id_utente` int(11) NOT NULL,
  `data_creazione` datetime NOT NULL,
  `id_canzone` int(11) NOT NULL,
  PRIMARY KEY (`id_registrazione`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registrazione`
--

LOCK TABLES `registrazione` WRITE;
/*!40000 ALTER TABLE `registrazione` DISABLE KEYS */;
INSERT INTO `registrazione` VALUES (1,1,'2018-07-13 00:00:00',1),(2,1,'2018-07-15 20:19:17',2);
/*!40000 ALTER TABLE `registrazione` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utente`
--

DROP TABLE IF EXISTS `utente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `utente` (
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
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utente`
--

LOCK TABLES `utente` WRITE;
/*!40000 ALTER TABLE `utente` DISABLE KEYS */;
INSERT INTO `utente` VALUES (1,'Mario','Saponara','mario@tiscali.it','2018-01-02','Agropoli','M','Rock',1,'02881212','C',000,0,'mario','mario',NULL,4.28125,5),(6,'Giuseppe','Scagliola','g.scagliola@contrader.it','1996-03-19','Terlizzi','M','Pop',1,'3491547650','G',000,0,'peppe','peppe',NULL,0,0),(7,'Giuseppe','Rossi','g.rossi@contrader.it','1985-05-15','Napoli','M','Rock',1,'3544895210','C',000,0,'apeppe2','peppe',NULL,0,0),(8,'Mario','Rossi','m.rossi@contrader.it','1980-06-14','Milano','M','Rap',1,'3514789662','C',000,0,'mario3','mario3',NULL,0,0);
/*!40000 ALTER TABLE `utente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `votazione_cantante`
--

DROP TABLE IF EXISTS `votazione_cantante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `votazione_cantante` (
  `id_votazione_cantante` int(11) NOT NULL AUTO_INCREMENT,
  `id_registrazione` int(11) DEFAULT NULL,
  `id_cantante` int(11) DEFAULT NULL,
  `orecchiabilita` double DEFAULT NULL,
  `lo_scaricheresti` double DEFAULT NULL,
  PRIMARY KEY (`id_votazione_cantante`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votazione_cantante`
--

LOCK TABLES `votazione_cantante` WRITE;
/*!40000 ALTER TABLE `votazione_cantante` DISABLE KEYS */;
/*!40000 ALTER TABLE `votazione_cantante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `votazione_giudice`
--

DROP TABLE IF EXISTS `votazione_giudice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `votazione_giudice` (
  `id_votazione_giudice` int(11) NOT NULL AUTO_INCREMENT,
  `id_registrazione` int(11) DEFAULT NULL,
  `id_giudice` int(11) DEFAULT NULL,
  `intonazione` double DEFAULT NULL,
  `timbro` double DEFAULT NULL,
  `tono` double DEFAULT NULL,
  `unicita` double DEFAULT NULL,
  PRIMARY KEY (`id_votazione_giudice`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votazione_giudice`
--

LOCK TABLES `votazione_giudice` WRITE;
/*!40000 ALTER TABLE `votazione_giudice` DISABLE KEYS */;
/*!40000 ALTER TABLE `votazione_giudice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `votazione_sistema`
--

DROP TABLE IF EXISTS `votazione_sistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `votazione_sistema` (
  `id_votazione_sistema` int(11) NOT NULL AUTO_INCREMENT,
  `id_registrazione` int(11) DEFAULT NULL,
  `fedelta` double DEFAULT NULL,
  `intonazione` double DEFAULT NULL,
  `potenza` double DEFAULT NULL,
  `estensione` double DEFAULT NULL,
  `data` datetime DEFAULT NULL,
  PRIMARY KEY (`id_votazione_sistema`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votazione_sistema`
--

LOCK TABLES `votazione_sistema` WRITE;
/*!40000 ALTER TABLE `votazione_sistema` DISABLE KEYS */;
/*!40000 ALTER TABLE `votazione_sistema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `voto`
--

DROP TABLE IF EXISTS `voto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `voto` (
  `id_registrazione` int(11) NOT NULL,
  `voto` int(11) NOT NULL,
  `data` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `voto`
--

LOCK TABLES `voto` WRITE;
/*!40000 ALTER TABLE `voto` DISABLE KEYS */;
INSERT INTO `voto` VALUES (2,2,'2018-07-16'),(2,3,'2018-07-16'),(1,2,'2018-07-16'),(1,3,'2018-07-16'),(2,4,'2018-07-16'),(1,5,'2018-07-16'),(1,3,'2018-07-16'),(1,3,'2018-07-16'),(1,5,'2018-07-16'),(2,3,'2018-07-16'),(2,3,'2018-07-16'),(2,4,'2018-07-16'),(2,4,'2018-07-16'),(2,3,'2018-07-16'),(2,3,'2018-07-16'),(2,4,'2018-07-16'),(2,4,'2018-07-16'),(1,3,'2018-07-16'),(1,3,'2018-07-16'),(1,3,'2018-07-16'),(2,4,'2018-07-16'),(2,4,'2018-07-16'),(1,5,'2018-07-16');
/*!40000 ALTER TABLE `voto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-17 17:32:36
