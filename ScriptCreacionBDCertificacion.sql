-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 172.20.1.7    Database: poo-campos
-- ------------------------------------------------------
-- Server version	5.7.16

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
-- Table structure for table `Campos`
--

DROP TABLE IF EXISTS `Campos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Campos` (
  `id_campo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `superficie` decimal(19,2) DEFAULT NULL,
  `id_estado` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_campo`),
  KEY `FKggloejdkgi4tpil2gmy4y7u2t` (`id_estado`)
) ENGINE=MyISAM AUTO_INCREMENT=39 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Campos`
--

LOCK TABLES `Campos` WRITE;
/*!40000 ALTER TABLE `Campos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Campos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EstadosCampo`
--

DROP TABLE IF EXISTS `EstadosCampo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EstadosCampo` (
  `id_estado` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_estado`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EstadosCampo`
--

LOCK TABLES `EstadosCampo` WRITE;
/*!40000 ALTER TABLE `EstadosCampo` DISABLE KEYS */;
INSERT INTO `EstadosCampo` VALUES (1,'Creado',NULL),(2,'Parcialmente trabajado',NULL),(3,'Completamente trabajado ',NULL),(4,'En desuso ',NULL);
/*!40000 ALTER TABLE `EstadosCampo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Lotes`
--

DROP TABLE IF EXISTS `Lotes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Lotes` (
  `id_lote` int(11) NOT NULL AUTO_INCREMENT,
  `numero` bigint(20) DEFAULT NULL,
  `superficie` decimal(19,2) DEFAULT NULL,
  `id_tipoSuelo` int(11) DEFAULT NULL,
  `id_campo` int(11) NOT NULL,
  PRIMARY KEY (`id_lote`),
  KEY `FKet571f2875iabvo54fpygyvxl` (`id_tipoSuelo`),
  KEY `FKqj9wc2v86tluf95w9c5n0656v` (`id_campo`)
) ENGINE=MyISAM AUTO_INCREMENT=75 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Lotes`
--

LOCK TABLES `Lotes` WRITE;
/*!40000 ALTER TABLE `Lotes` DISABLE KEYS */;
/*!40000 ALTER TABLE `Lotes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TiposSuelo`
--

DROP TABLE IF EXISTS `TiposSuelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TiposSuelo` (
  `id_tipo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TiposSuelo`
--

LOCK TABLES `TiposSuelo` WRITE;
/*!40000 ALTER TABLE `TiposSuelo` DISABLE KEYS */;
INSERT INTO `TiposSuelo` VALUES (1,'I','Tipo 1'),(2,'II','Tipo 2'),(3,'III','Tipo 3'),(4,'IV','Tipo 4'),(5,'V','Tipo 5');
/*!40000 ALTER TABLE `TiposSuelo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-12-13  9:49:33
