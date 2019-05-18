-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: ibet
-- ------------------------------------------------------
-- Server version	5.7.22-0ubuntu0.17.10.1

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
-- Current Database: `ibet`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `ibet` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `ibet`;

--
-- Table structure for table `t_bet`
--

DROP TABLE IF EXISTS `t_bet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_bet` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `redballrange` int(11) NOT NULL,
  `blueballrange` int(11) NOT NULL,
  `picname` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_bet`
--

LOCK TABLES `t_bet` WRITE;
/*!40000 ALTER TABLE `t_bet` DISABLE KEYS */;
INSERT INTO `t_bet` VALUES (1,'双色球',33,16,'shuangseqiu'),(2,'七乐彩',30,0,'shuangseqiu'),(3,'3D',0,0,'shuangseqiu');
/*!40000 ALTER TABLE `t_bet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_bet_betsite`
--

DROP TABLE IF EXISTS `t_bet_betsite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_bet_betsite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `betid` int(11) DEFAULT NULL,
  `betsiteid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `betid_idx` (`betid`),
  KEY `betsiteid_idx` (`betsiteid`),
  CONSTRAINT `betid` FOREIGN KEY (`betid`) REFERENCES `t_bet` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `betsiteid1` FOREIGN KEY (`betsiteid`) REFERENCES `t_betsite` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_bet_betsite`
--

LOCK TABLES `t_bet_betsite` WRITE;
/*!40000 ALTER TABLE `t_bet_betsite` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_bet_betsite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_betsite`
--

DROP TABLE IF EXISTS `t_betsite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_betsite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `master` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `wxopneid` varchar(45) DEFAULT NULL,
  `registertime` datetime DEFAULT NULL,
  `betTypes` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_betsite`
--

LOCK TABLES `t_betsite` WRITE;
/*!40000 ALTER TABLE `t_betsite` DISABLE KEYS */;
INSERT INTO `t_betsite` VALUES (1,'常营投注站','张三','zhangsan','111111',NULL,NULL,'1,2,3'),(2,'翠福园投注站','孔征','kongzheng','111111',NULL,NULL,'1,3'),(4,'宁阳投注站','孔征','tom','111111',NULL,'2019-02-18 22:28:44','1,2,3');
/*!40000 ALTER TABLE `t_betsite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_order`
--

DROP TABLE IF EXISTS `t_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `betsiteid` int(11) DEFAULT NULL,
  `betid` int(11) DEFAULT NULL,
  `redballs` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `blueballs` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `times` int(11) DEFAULT NULL,
  `ordertime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_t_order_1_idx` (`userid`),
  KEY `fk_t_order_2_idx` (`betsiteid`),
  KEY `fk_t_order_3_idx` (`betid`),
  KEY `ordertimeIndex` (`ordertime`),
  CONSTRAINT `fk_t_order_1` FOREIGN KEY (`userid`) REFERENCES `t_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_order_2` FOREIGN KEY (`betsiteid`) REFERENCES `t_betsite` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_t_order_3` FOREIGN KEY (`betid`) REFERENCES `t_bet` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_order`
--

LOCK TABLES `t_order` WRITE;
/*!40000 ALTER TABLE `t_order` DISABLE KEYS */;
INSERT INTO `t_order` VALUES (1,16,1,1,'[4,5,6,7,8,9]','[8]',1,'2019-02-17 13:50:16'),(2,16,1,3,'[[3,4],[5,6],[7,8]]','[]',1,'2019-02-17 14:10:25'),(3,16,1,2,'[4,5,6,7,8,9,10]','[]',1,'2019-02-17 14:29:23'),(4,16,1,1,'[2,3,15,27,28,29]','[7]',1,'2019-02-17 23:59:24'),(5,16,1,1,'[17,18,28,29,30,31]','[7]',1,'2019-02-18 22:55:53'),(6,16,1,1,'[15,16,17,18,19,20]','[6]',1,'2019-02-18 22:57:45'),(7,16,1,2,'[15,18,19,20,21,22,30]','[]',1,'2019-02-18 22:58:22'),(8,16,1,3,'[6]','[]',1,'2019-02-18 23:01:45'),(9,16,1,3,'[7]','[]',1,'2019-02-18 23:03:43'),(10,16,1,3,'[3]','[]',1,'2019-02-18 23:05:30'),(11,16,1,3,'[5]','[]',1,'2019-02-18 23:07:00'),(12,16,1,3,'[3]','[]',1,'2019-02-18 23:09:13'),(13,16,1,3,'[[3],[4],[6]]','[]',1,'2019-02-18 23:10:16'),(14,16,1,3,'[[5],[4],[5]]','[]',1,'2019-02-18 23:44:24'),(15,16,1,3,'[[5],[5],[6]]','[]',1,'2019-02-18 23:49:51'),(16,16,1,3,'[[3],[6],[5]]','[]',1,'2019-02-18 23:56:57'),(17,16,1,3,'[[7],[5],[8]]','[]',1,'2019-02-18 23:58:29'),(18,16,1,2,'[29,27,17,18,8,9,10]','[]',1,'2019-02-18 23:59:38'),(19,16,2,1,'[3,15,28,29,20,31]','[16]',1,'2019-02-19 20:59:56');
/*!40000 ALTER TABLE `t_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user`
--

DROP TABLE IF EXISTS `t_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `wxopenid` varchar(45) NOT NULL,
  `username` varchar(45) DEFAULT NULL,
  `wxnickname` varchar(45) DEFAULT NULL,
  `IDCardNo` varchar(20) DEFAULT NULL,
  `phoneNo` varchar(30) DEFAULT NULL,
  `registertime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user`
--

LOCK TABLES `t_user` WRITE;
/*!40000 ALTER TABLE `t_user` DISABLE KEYS */;
INSERT INTO `t_user` VALUES (16,'oBrQB5cSok6qTv0hGMVmKY0M6YOk','孔征','evilRat','370921199210013316','15810692477',NULL);
/*!40000 ALTER TABLE `t_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_user_betsite`
--

DROP TABLE IF EXISTS `t_user_betsite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `t_user_betsite` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `betsiteid` int(11) DEFAULT NULL,
  `balance` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `userid_idx` (`userid`),
  KEY `betsiteid_idx` (`betsiteid`),
  CONSTRAINT `betsiteid` FOREIGN KEY (`betsiteid`) REFERENCES `t_betsite` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `t_user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_user_betsite`
--

LOCK TABLES `t_user_betsite` WRITE;
/*!40000 ALTER TABLE `t_user_betsite` DISABLE KEYS */;
INSERT INTO `t_user_betsite` VALUES (2,16,1,184.43),(3,16,2,198.00),(6,16,4,1.00);
/*!40000 ALTER TABLE `t_user_betsite` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-05-05 21:23:34
