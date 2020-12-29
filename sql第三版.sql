/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 8.0.17 : Database - blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `blog`;

/*Table structure for table `blogs` */

DROP TABLE IF EXISTS `blogs`;

CREATE TABLE `blogs` (
  `id` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '文章的id',
  `content` text COMMENT '博客内容',
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '写博客的人',
  `type` int(11) NOT NULL COMMENT 'markdown or 思维导图',
  `visible` int(1) NOT NULL COMMENT '是否可见 0不可见',
  `description` text NOT NULL COMMENT '描述'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `blogs` */

insert  into `blogs`(`id`,`content`,`username`,`type`,`visible`,`description`) values ('1111','用户1的可见markdown','lxz',0,1,'1'),('2222','用户1的可见思维导图','lxz',1,1,'1'),('3333','用户1的不可见markdown','lxz',0,0,'1'),('4444','用户1的不可见思维导图','lxz',1,0,'1'),('5555','用户2的可见markdown','2',0,1,'2'),('6666','用户2的可见思维导图','2',1,1,'2'),('7777','用户2的不可见markdown','2',0,0,'2'),('8888','用户2的不可见思维导图','2',1,0,'2');

/*Table structure for table `user_password` */

DROP TABLE IF EXISTS `user_password`;

CREATE TABLE `user_password` (
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '用户名，唯一标识',
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户密码',
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `user_password` */

insert  into `user_password`(`username`,`password`) values ('lxz','$2a$10$qTSHcp604/PiGwLTPwgmMe08E/2YwlDFWIW5Q08V7a6U7g5yGG7s2');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
