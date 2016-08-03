-- MySQL dump 10.13  Distrib 5.6.27, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: dd
-- ------------------------------------------------------
-- Server version	5.6.27-0ubuntu0.15.04.1

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
-- Table structure for table `Joke`
--

DROP TABLE IF EXISTS `Joke`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Joke` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL COMMENT '作者id',
  `title` varchar(50) NOT NULL COMMENT '标题',
  `subject` varchar(100) NOT NULL COMMENT '摘要',
  `content` varchar(2500) NOT NULL COMMENT '内容',
  `like_count` int(11) NOT NULL COMMENT '点赞',
  `collection_count` int(11) NOT NULL COMMENT ' 收藏',
  `view_count` int(11) NOT NULL COMMENT '浏览次数',
  `publish_time` datetime NOT NULL COMMENT '发布时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Joke`
--

LOCK TABLES `Joke` WRITE;
/*!40000 ALTER TABLE `Joke` DISABLE KEYS */;
/*!40000 ALTER TABLE `Joke` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `catagory` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户类别:1会员，０未认证',
  `username` varchar(50) DEFAULT NULL COMMENT '用户名',
  `mobilephone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) DEFAULT NULL COMMENT '邮件',
  `password` varchar(100) NOT NULL DEFAULT '666666' COMMENT '加密密码',
  `qq` varchar(100) DEFAULT NULL COMMENT '第三方QQ',
  `wechat` varchar(100) DEFAULT NULL COMMENT '第三方微信号',
  `webo` varchar(100) DEFAULT NULL COMMENT '第三方微博号',
  `source` tinyint(4) NOT NULL DEFAULT '0' COMMENT '账号来源:0移动端，１网站',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '账号创建时间',
  `last_update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '账号修改时间',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '账号状态:0正常，-1注销，1异常',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (2,0,NULL,'13521389587',NULL,'test',NULL,NULL,NULL,0,'2016-07-25 15:08:36','2016-07-25 15:08:36',0);
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `activity`
--

DROP TABLE IF EXISTS `activity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activity` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL COMMENT '活动名称',
  `description` varchar(200) NOT NULL COMMENT '活动描述',
  `start_time` datetime NOT NULL COMMENT '起始时间',
  `end_time` datetime NOT NULL COMMENT '结束时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activity`
--

LOCK TABLES `activity` WRITE;
/*!40000 ALTER TABLE `activity` DISABLE KEYS */;
/*!40000 ALTER TABLE `activity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collection_operation`
--

DROP TABLE IF EXISTS `collection_operation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collection_operation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kind` tinyint(4) NOT NULL COMMENT '收藏类型',
  `detail_id` int(11) NOT NULL COMMENT '具体id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `operation_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collection_operation`
--

LOCK TABLES `collection_operation` WRITE;
/*!40000 ALTER TABLE `collection_operation` DISABLE KEYS */;
/*!40000 ALTER TABLE `collection_operation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `information`
--

DROP TABLE IF EXISTS `information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `information` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `nickname` varchar(50) DEFAULT NULL COMMENT '昵称',
  `sex` tinyint(1) DEFAULT NULL COMMENT '病人性别',
  `birthday` date DEFAULT NULL COMMENT '病人生日',
  `icon_url` varchar(150) DEFAULT NULL COMMENT '图像地址',
  `address` varchar(100) DEFAULT NULL COMMENT '现住地',
  `qq_name` varchar(100) DEFAULT NULL COMMENT 'qq昵称',
  `wechat_name` varchar(100) DEFAULT NULL COMMENT '微信昵称',
  `webo_name` varchar(100) DEFAULT NULL COMMENT '微博昵称',
  `modify_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `status` int(11) NOT NULL DEFAULT '0' COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `information`
--

LOCK TABLES `information` WRITE;
/*!40000 ALTER TABLE `information` DISABLE KEYS */;
INSERT INTO `information` VALUES (1,2,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,'2016-07-25 15:08:36','2016-07-25 15:08:36',0);
/*!40000 ALTER TABLE `information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level_change`
--

DROP TABLE IF EXISTS `level_change`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level_change` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `level_id` int(11) NOT NULL COMMENT '等级id',
  `score` int(11) NOT NULL COMMENT '积分数',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level_change`
--

LOCK TABLES `level_change` WRITE;
/*!40000 ALTER TABLE `level_change` DISABLE KEYS */;
/*!40000 ALTER TABLE `level_change` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `level_rule`
--

DROP TABLE IF EXISTS `level_rule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `level_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '等级名称',
  `description` varchar(100) NOT NULL COMMENT '等级描述',
  `start_count` int(11) NOT NULL COMMENT '开始积分',
  `end_count` int(11) NOT NULL COMMENT '结束积分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `level_rule`
--

LOCK TABLES `level_rule` WRITE;
/*!40000 ALTER TABLE `level_rule` DISABLE KEYS */;
/*!40000 ALTER TABLE `level_rule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `like_operation`
--

DROP TABLE IF EXISTS `like_operation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `like_operation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `kind` int(11) NOT NULL COMMENT '类型',
  `detail_id` int(11) NOT NULL COMMENT '详细id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `operation_time` int(11) NOT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `like_operation`
--

LOCK TABLES `like_operation` WRITE;
/*!40000 ALTER TABLE `like_operation` DISABLE KEYS */;
/*!40000 ALTER TABLE `like_operation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `msg_detail`
--

DROP TABLE IF EXISTS `msg_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `msg_detail` (
  `id` int(11) NOT NULL,
  `catagory` int(11) NOT NULL COMMENT '类别',
  `title` varchar(100) NOT NULL COMMENT '标题',
  `content` varchar(1000) NOT NULL COMMENT '内容',
  `create_time` datetime NOT NULL COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `msg_detail`
--

LOCK TABLES `msg_detail` WRITE;
/*!40000 ALTER TABLE `msg_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `msg_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `msg_subject`
--

DROP TABLE IF EXISTS `msg_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `msg_subject` (
  `id` int(11) NOT NULL,
  `msgId` int(11) NOT NULL COMMENT '消息id',
  `catagory` int(11) NOT NULL COMMENT '类别',
  `title` varchar(50) NOT NULL COMMENT '标题',
  `url` varchar(500) NOT NULL COMMENT '内容链接',
  `create_time` datetime NOT NULL COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `msg_subject`
--

LOCK TABLES `msg_subject` WRITE;
/*!40000 ALTER TABLE `msg_subject` DISABLE KEYS */;
/*!40000 ALTER TABLE `msg_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rank_item`
--

DROP TABLE IF EXISTS `rank_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rank_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `catagory` int(11) NOT NULL COMMENT '类别',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `score` int(11) NOT NULL COMMENT '排行分数',
  `rank_list_id` int(11) NOT NULL COMMENT '排行榜',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rank_item`
--

LOCK TABLES `rank_item` WRITE;
/*!40000 ALTER TABLE `rank_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `rank_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rank_list`
--

DROP TABLE IF EXISTS `rank_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `rank_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '排行榜名称',
  `description` varchar(100) NOT NULL COMMENT '排行榜描述',
  `count` int(11) NOT NULL COMMENT '参与人数',
  `catagory` int(11) NOT NULL COMMENT '排行榜类型',
  `rank_time` datetime NOT NULL COMMENT '排行时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rank_list`
--

LOCK TABLES `rank_list` WRITE;
/*!40000 ALTER TABLE `rank_list` DISABLE KEYS */;
/*!40000 ALTER TABLE `rank_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reply_subject`
--

DROP TABLE IF EXISTS `reply_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reply_subject` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '回复人ID',
  `subject_id` int(11) NOT NULL COMMENT '帖子id',
  `reply_content` varchar(255) NOT NULL COMMENT '回复内容',
  `reply_ioc_info` varchar(255) DEFAULT NULL COMMENT '回复地址信息',
  `reply_sound_url` varchar(255) DEFAULT NULL COMMENT '回帖的声音',
  `reply_img_urls` varchar(500) DEFAULT NULL COMMENT '回帖的图像',
  `reply_time` datetime NOT NULL COMMENT '回复时间',
  `repeat_reply` varchar(1500) DEFAULT NULL COMMENT '回复者id列表',
  `status` tinyint(4) NOT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply_subject`
--

LOCK TABLES `reply_subject` WRITE;
/*!40000 ALTER TABLE `reply_subject` DISABLE KEYS */;
/*!40000 ALTER TABLE `reply_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resource`
--

DROP TABLE IF EXISTS `resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(100) NOT NULL COMMENT '内容描述',
  `url` varchar(50) NOT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resource`
--

LOCK TABLES `resource` WRITE;
/*!40000 ALTER TABLE `resource` DISABLE KEYS */;
INSERT INTO `resource` VALUES (1,'注册账号','/account/register'),(2,'添加角色','/role/add'),(3,'添加资源','/resource/add');
/*!40000 ALTER TABLE `resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) NOT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'管理员'),(2,'会员'),(3,'游客');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_resource`
--

DROP TABLE IF EXISTS `role_resource`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_resource` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `resource_id` int(11) NOT NULL COMMENT '资源id',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_resource`
--

LOCK TABLES `role_resource` WRITE;
/*!40000 ALTER TABLE `role_resource` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_resource` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score_change`
--

DROP TABLE IF EXISTS `score_change`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `score_change` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `score_id` int(11) NOT NULL COMMENT '积分项id',
  `count` int(11) NOT NULL COMMENT '积分数',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_change`
--

LOCK TABLES `score_change` WRITE;
/*!40000 ALTER TABLE `score_change` DISABLE KEYS */;
/*!40000 ALTER TABLE `score_change` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score_item`
--

DROP TABLE IF EXISTS `score_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `score_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `catagory` int(11) NOT NULL COMMENT '类别',
  `item` int(11) NOT NULL COMMENT '项目',
  `encourage` int(11) NOT NULL COMMENT '鼓励程度',
  `score` int(11) NOT NULL COMMENT '积分',
  `rule_id` int(11) NOT NULL COMMENT '规则id',
  `create_time` datetime NOT NULL COMMENT '规则创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_item`
--

LOCK TABLES `score_item` WRITE;
/*!40000 ALTER TABLE `score_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `score_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score_rule`
--

DROP TABLE IF EXISTS `score_rule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `score_rule` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL COMMENT '名称',
  `description` varchar(100) NOT NULL COMMENT '描述',
  `update_time` datetime NOT NULL COMMENT '规则更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_rule`
--

LOCK TABLES `score_rule` WRITE;
/*!40000 ALTER TABLE `score_rule` DISABLE KEYS */;
/*!40000 ALTER TABLE `score_rule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop_order`
--

DROP TABLE IF EXISTS `shop_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shop_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `order_id` varchar(100) NOT NULL COMMENT '订单号',
  `body` varchar(500) NOT NULL COMMENT '商品描述',
  `detail` varchar(2000) NOT NULL COMMENT '商品详情',
  `fee_type` varchar(50) NOT NULL COMMENT '货币类型',
  `total_fee` int(11) NOT NULL COMMENT '总金额',
  `status` int(11) NOT NULL COMMENT '订单状态',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '订单生成时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop_order`
--

LOCK TABLES `shop_order` WRITE;
/*!40000 ALTER TABLE `shop_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `shop_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subject` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL COMMENT '标题',
  `img_urls` varchar(1500) DEFAULT NULL COMMENT '图片地址',
  `author_id` int(11) NOT NULL COMMENT '作者id',
  `reply_num` int(11) DEFAULT NULL COMMENT '回复数',
  `view_count` int(11) DEFAULT NULL COMMENT '浏览数',
  `file_url` varchar(255) DEFAULT NULL COMMENT '附件url',
  `like_count` int(11) DEFAULT NULL COMMENT '被多少人赞过',
  `publish_time` datetime NOT NULL COMMENT '发帖时间',
  `subject_type` tinyint(4) DEFAULT '0' COMMENT '帖子类型',
  `loc_Info` varchar(255) DEFAULT NULL COMMENT '具体的定位信息',
  `video_url` varchar(255) DEFAULT NULL COMMENT '视频地址',
  `sound_url` int(11) DEFAULT NULL COMMENT '声音地址',
  `lng` double DEFAULT NULL COMMENT '定位的经度',
  `lat` double DEFAULT NULL COMMENT '定位的纬度',
  `collectionCount` int(11) DEFAULT NULL COMMENT '收藏次数',
  `content` text NOT NULL COMMENT '帖子内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (2,'happy',NULL,20014,NULL,NULL,NULL,NULL,'2016-06-24 11:50:42',0,NULL,NULL,NULL,0,0,NULL,'每天快乐');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-07-27 16:49:35
