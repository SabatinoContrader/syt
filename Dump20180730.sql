CREATE DATABASE  IF NOT EXISTS `sytdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `sytdb`;
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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `canzone`
--

LOCK TABLES `canzone` WRITE;
/*!40000 ALTER TABLE `canzone` DISABLE KEYS */;
INSERT INTO `canzone` VALUES (1,1,'Pop','https://www.youtube.com/embed/mk48xRzuNvA','Hall Of Fame'),(2,1,'Pop','https://www.youtube.com/embed/AcHHE9bvLgY','Rockadown'),(3,1,'Pop','https://www.youtube.com/embed/_u78C6DnjLY','Halo');
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
  PRIMARY KEY (`id_pubblicazione`),
  KEY `FKo9xltv2cg96sp3ioc9972655g` (`id_utente`),
  CONSTRAINT `FKo9xltv2cg96sp3ioc9972655g` FOREIGN KEY (`id_utente`) REFERENCES `utente` (`id_utente`)
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
  `data_creazione` date NOT NULL,
  `id_canzone` int(11) NOT NULL,
  PRIMARY KEY (`id_registrazione`),
  KEY `FKjm9w1e0cy2aegkdhb5yq65864` (`id_canzone`),
  KEY `FKs2lux43c1dtswtqpjck6wff69` (`id_utente`),
  CONSTRAINT `FKjm9w1e0cy2aegkdhb5yq65864` FOREIGN KEY (`id_canzone`) REFERENCES `canzone` (`id_canzone`),
  CONSTRAINT `FKs2lux43c1dtswtqpjck6wff69` FOREIGN KEY (`id_utente`) REFERENCES `utente` (`id_utente`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registrazione`
--

LOCK TABLES `registrazione` WRITE;
/*!40000 ALTER TABLE `registrazione` DISABLE KEYS */;
INSERT INTO `registrazione` VALUES (1,1,'2018-07-13',1),(2,7,'2018-07-15',2),(3,1,'2018-07-15',1),(4,7,'2018-07-15',2),(5,1,'2018-07-15',1),(6,8,'2018-07-15',2),(7,8,'2018-07-15',1);
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
  `media_voto` double DEFAULT NULL,
  `n_voti` int(10) DEFAULT NULL,
  PRIMARY KEY (`id_utente`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utente`
--

LOCK TABLES `utente` WRITE;
/*!40000 ALTER TABLE `utente` DISABLE KEYS */;
INSERT INTO `utente` VALUES (1,'Mario','Saponara','mario@tiscali.it','2018-01-02','Agropoli','M','Pop',1,'02881212','C',000,0,'mario','mario',4.28125,5),(6,'Giuseppe','Scagliola','g.scagliola@contrader.it','1996-03-19','Terlizzi','M','Pop',1,'3491547650','G',000,0,'peppe','peppe',0,0),(7,'Giuseppe','Rossi','g.rossi@contrader.it','1985-05-15','Napoli','M','Rock',1,'3544895210','C',000,0,'apeppe2','peppe',0,0),(8,'Mario','Rossi','m.rossi@contrader.it','1980-06-14','Milano','M','Rap',1,'3514789662','C',000,0,'mario3','mario3',0,0),(9,'emiliano','carluccio','emil@.it','2015-11-13','maglie','M','pop',1,'98899','C',000,0,'emiliano','emiliano',NULL,NULL),(10,'emiliano','carluccio','emil@.it','2015-11-13','maglie','M','pop',1,'98899','C',000,0,'emiliano','emiliano',NULL,NULL),(11,'emilrt','carluccio','emilianocarl@v.it','2015-11-06','maglie','M','Rock',1,'4488855','C',000,0,'emilg','emilg',NULL,NULL),(12,'Carlo','Del Colle','c.delcol@.it','2015-12-12','Napoli','M','Rap',1,'35566222','C',000,0,'carlo','carlo',NULL,NULL),(13,'qqq','qqq','qqq','1994-02-10','qqq','F','Rap',1,'1234567890','C',000,0,'qqq','qqq',0,0);
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
  `media` double DEFAULT NULL,
  `voti` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_votazione_cantante`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votazione_cantante`
--

LOCK TABLES `votazione_cantante` WRITE;
/*!40000 ALTER TABLE `votazione_cantante` DISABLE KEYS */;
INSERT INTO `votazione_cantante` VALUES (1,1,1,1,3,NULL,NULL),(2,2,1,5,5,NULL,NULL),(3,1,1,5,5,5,2);
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
  `media` double DEFAULT NULL,
  `votato_da_cantante` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id_votazione_giudice`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votazione_giudice`
--

LOCK TABLES `votazione_giudice` WRITE;
/*!40000 ALTER TABLE `votazione_giudice` DISABLE KEYS */;
INSERT INTO `votazione_giudice` VALUES (2,2,6,1,1,1,1,1,'\0'),(7,1,6,5,5,5,5,5,''),(8,4,6,4,4,4,4,4,'\0');
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
  `data` date DEFAULT NULL,
  `media` double DEFAULT NULL,
  `votato_da_giudice` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id_votazione_sistema`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `votazione_sistema`
--

LOCK TABLES `votazione_sistema` WRITE;
/*!40000 ALTER TABLE `votazione_sistema` DISABLE KEYS */;
INSERT INTO `votazione_sistema` VALUES (9,1,1.1583035659839704,1.5482017129689902,1.0900407936602776,1.6569061215439342,'2018-07-20',3.5,''),(23,6,1.3982308772301737,1.6711110159875802,1.1904169392131185,1.0219804743630765,'2018-07-27',1.320434826698487,'\0'),(24,7,1.085267913094433,1.0841951678885087,1.7845538644383176,1.7448333474651,'2018-07-27',1.4247125732215897,'\0'),(25,8,1.3511260098116344,1.1704997054352009,1.300759283651861,1.3778084241424606,'2018-07-27',1.3000483557602893,'\0'),(26,2,1.3280759034470169,1.0603423230867386,1.1221955527073546,1.2060407801842818,'2018-07-27',1.1791636398563479,'\0'),(27,4,1.1986555894396012,1.1354324538471583,1.2309215121375703,1.653917884736746,'2018-07-27',1.3047318600402689,''),(28,3,1.6314528847313383,1.6499723821243508,1.9431897455387204,1.6794299434241662,'2018-07-27',1.7260112389546438,'\0'),(29,5,1.1886980636187043,1.1128676465609892,1.1460961771241556,1.9168665533194273,'2018-07-27',1.3411321101558191,'\0'),(30,9,1.1077655038649281,1.4657521431282596,1.2156825402248344,1.9170223245299902,'2018-07-30',1.426555627937003,'\0'),(31,10,1.334521485402421,1.2635519537743112,1.7494630314774038,1.1874910582836802,'2018-07-30',1.383756882234454,'\0');
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

-- Dump completed on 2018-07-30 10:49:38
votazione_giudice